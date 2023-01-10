package yinghangjia;

class thread implements Runnable {
    private int id;
    Banker b;

    thread(int id, Banker b) {
        this.id = id;
        this.b = b;
    }

    public int getId() {
        return this.id;
    }

    public void run() {
        try {
            Thread.sleep(1000 + id * 3000);
            // 请求获得资源
            int[] in = new int[]{b.Need[id][0], b.Need[id][1], b.Need[id][2]};
            System.out.println("进程" + id + "请求资源数依次为：" + in[0] + "个" + in[1] + "个" + in[2] + "个");
            b.request(id, in);
            System.out.println("进程" + id + "执行完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
