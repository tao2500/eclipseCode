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
            // ��������Դ
            int[] in = new int[]{b.Need[id][0], b.Need[id][1], b.Need[id][2]};
            System.out.println("����" + id + "������Դ������Ϊ��" + in[0] + "��" + in[1] + "��" + in[2] + "��");
            b.request(id, in);
            System.out.println("����" + id + "ִ�����");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
