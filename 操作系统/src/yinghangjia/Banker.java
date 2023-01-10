package yinghangjia;

public class Banker {
    // 系统总资源
    public int[] Available;
    // 最大需求矩阵
    public int[][] Max;
    // 分配矩阵(已分配资源)
    public int[][] Allocation;
    // 需求矩阵(还需分配资源,Need（i，j）=Max（i，j）-Allocation（i，j）)
    public int[][] Need;

    // T0时刻初始化
    public void init() {
        this.Max = new int[][]{{7, 5, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3}};
        this.Allocation = new int[][]{{0, 1, 0}, {2, 0, 0}, {3, 0, 2}, {2, 1, 1}, {0, 0, 2}};
        this.Need = new int[][]{{7, 4, 3}, {1, 2, 2}, {6, 0, 6}, {0, 1, 1}, {4, 3, 1}};
        this.Available = new int[]{3, 3, 2};
    }

    public void bank() {
        init();
        System.out.println("初始化资源分配成功");
        for (int i = 0; i < 5; i++) {
            thread pro = new thread(i, this);
            new Thread(pro).start();
            System.out.println("系统创建并执行线程" + i);
        }

    }

    //	 id为tid的进程请求集count
    public void request(int tid, int[] count) {
        System.out.println("系统尝试给进程" + tid + "分配资源");
        if (Need[tid][0] >= count[0] || Need[tid][1] >= count[1] || Need[tid][2] >= count[2]) {
            // 现有可分配资源多余请求所需时
            if (Available[0] >= count[0] && Available[1] >= count[1] && Available[2] >= count[2]) {
                // 分配资源
                Available[0] = Available[0] - count[0];
                Available[1] = Available[1] - count[1];
                Available[2] = Available[2] - count[2];
                Allocation[tid][0] = Allocation[tid][0] + count[0];
                Allocation[tid][1] = Allocation[tid][1] + count[1];
                Allocation[tid][2] = Allocation[tid][2] + count[2];
                Need[tid][0] = Need[tid][0] - count[0];
                Need[tid][1] = Need[tid][1] - count[1];
                Need[tid][2] = Need[tid][2] - count[2];
                // 安全检验不通过时
                System.out.println("开始进行safe检验");
                if (!safe()) {
                    System.out.println("给进程" + tid + "分配资源！！不满足安全策略，取消分配");
                    Available[0] = Available[0] + count[0];
                    Available[1] = Available[1] + count[1];
                    Available[2] = Available[2] + count[2];
                    Allocation[tid][0] = Allocation[tid][0] - count[0];
                    Allocation[tid][1] = Allocation[tid][1] - count[1];
                    Allocation[tid][2] = Allocation[tid][2] - count[2];
                    Need[tid][0] = Need[tid][0] + count[0];
                    Need[tid][1] = Need[tid][1] + count[1];
                    Need[tid][2] = Need[tid][2] + count[2];
                } else {
                    System.out.println("给进程" + tid + "分配资源~满足安全策略，确认分配");
                }
            } else {
                System.out.println("进程" + tid + "ERROR: REQUEST > Available");
            }
        } else {
            System.out.println("进程" + tid + "ERROR: REQUEST > NEED");
        }
    }

    public boolean safe() {
        //安全性算法的初始资源总数
        int[] Work = this.Available;
        // 表示系统是否有足够的资源分配该进程
        boolean[] Finish = new boolean[]{false, false, false, false, false};
        // 还未遍历线程找到解决方案
        boolean b = false;
        // 保存线程能继续执行的个数
        int truecount = 0;
        int count = 0;
        while (!b) {
            count += 1;
            // 标志for循环执行biaozhi次未被打断（当biaozhi==5时没有找到解）
            int biaozhi = 0;
            for (int i = 0; i < 5; i++) {
                biaozhi += 1;
                // 2
                if (Finish[i] == false && this.Need[i][0] <= Work[0] && this.Need[i][1] <= Work[1] && this.Need[i][2] <= Work[2]) {
                    // 3
                    System.out.println("safe检测到进程" + i + "可执行，释放进程资源");
                    Work[0] += this.Allocation[i][0];
                    Work[1] += this.Allocation[i][1];
                    Work[2] += this.Allocation[i][2];
                    Finish[i] = true;
                    b = false;
                    // 继续从进程中寻找
                    break;
                }
            }
            // for循环遍历所有进程都没能再找到解，退出while循环
            if (biaozhi > 5)
                b = true;
        }
        System.out.println("退出while循环，共执行了" + count + "次");
        // 4
        for (int i = 0; i < 5; i++) {
            if (Finish[i] == true) {
                truecount = truecount + 1;
            } else {
            }
        }
        return truecount == 5;
    }

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        new Banker().bank();
    }

}


