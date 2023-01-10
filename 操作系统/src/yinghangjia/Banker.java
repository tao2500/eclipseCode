package yinghangjia;

public class Banker {
    // ϵͳ����Դ
    public int[] Available;
    // ����������
    public int[][] Max;
    // �������(�ѷ�����Դ)
    public int[][] Allocation;
    // �������(���������Դ,Need��i��j��=Max��i��j��-Allocation��i��j��)
    public int[][] Need;

    // T0ʱ�̳�ʼ��
    public void init() {
        this.Max = new int[][]{{7, 5, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3}};
        this.Allocation = new int[][]{{0, 1, 0}, {2, 0, 0}, {3, 0, 2}, {2, 1, 1}, {0, 0, 2}};
        this.Need = new int[][]{{7, 4, 3}, {1, 2, 2}, {6, 0, 6}, {0, 1, 1}, {4, 3, 1}};
        this.Available = new int[]{3, 3, 2};
    }

    public void bank() {
        init();
        System.out.println("��ʼ����Դ����ɹ�");
        for (int i = 0; i < 5; i++) {
            thread pro = new thread(i, this);
            new Thread(pro).start();
            System.out.println("ϵͳ������ִ���߳�" + i);
        }

    }

    //	 idΪtid�Ľ�������count
    public void request(int tid, int[] count) {
        System.out.println("ϵͳ���Ը�����" + tid + "������Դ");
        if (Need[tid][0] >= count[0] || Need[tid][1] >= count[1] || Need[tid][2] >= count[2]) {
            // ���пɷ�����Դ������������ʱ
            if (Available[0] >= count[0] && Available[1] >= count[1] && Available[2] >= count[2]) {
                // ������Դ
                Available[0] = Available[0] - count[0];
                Available[1] = Available[1] - count[1];
                Available[2] = Available[2] - count[2];
                Allocation[tid][0] = Allocation[tid][0] + count[0];
                Allocation[tid][1] = Allocation[tid][1] + count[1];
                Allocation[tid][2] = Allocation[tid][2] + count[2];
                Need[tid][0] = Need[tid][0] - count[0];
                Need[tid][1] = Need[tid][1] - count[1];
                Need[tid][2] = Need[tid][2] - count[2];
                // ��ȫ���鲻ͨ��ʱ
                System.out.println("��ʼ����safe����");
                if (!safe()) {
                    System.out.println("������" + tid + "������Դ���������㰲ȫ���ԣ�ȡ������");
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
                    System.out.println("������" + tid + "������Դ~���㰲ȫ���ԣ�ȷ�Ϸ���");
                }
            } else {
                System.out.println("����" + tid + "ERROR: REQUEST > Available");
            }
        } else {
            System.out.println("����" + tid + "ERROR: REQUEST > NEED");
        }
    }

    public boolean safe() {
        //��ȫ���㷨�ĳ�ʼ��Դ����
        int[] Work = this.Available;
        // ��ʾϵͳ�Ƿ����㹻����Դ����ý���
        boolean[] Finish = new boolean[]{false, false, false, false, false};
        // ��δ�����߳��ҵ��������
        boolean b = false;
        // �����߳��ܼ���ִ�еĸ���
        int truecount = 0;
        int count = 0;
        while (!b) {
            count += 1;
            // ��־forѭ��ִ��biaozhi��δ����ϣ���biaozhi==5ʱû���ҵ��⣩
            int biaozhi = 0;
            for (int i = 0; i < 5; i++) {
                biaozhi += 1;
                // 2
                if (Finish[i] == false && this.Need[i][0] <= Work[0] && this.Need[i][1] <= Work[1] && this.Need[i][2] <= Work[2]) {
                    // 3
                    System.out.println("safe��⵽����" + i + "��ִ�У��ͷŽ�����Դ");
                    Work[0] += this.Allocation[i][0];
                    Work[1] += this.Allocation[i][1];
                    Work[2] += this.Allocation[i][2];
                    Finish[i] = true;
                    b = false;
                    // �����ӽ�����Ѱ��
                    break;
                }
            }
            // forѭ���������н��̶�û�����ҵ��⣬�˳�whileѭ��
            if (biaozhi > 5)
                b = true;
        }
        System.out.println("�˳�whileѭ������ִ����" + count + "��");
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
        // TODO �Զ����ɵķ������
        new Banker().bank();
    }

}


