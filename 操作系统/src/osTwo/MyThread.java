package osTwo;

class MyThread implements Runnable {
	int count=1, number;
	public MyThread(int num) {
		number = num;
		System.out.println("�����߳� " + number);
	}
	public void run() {//ʵ���˽ӿڵ�run()����
		while(true) {
			System.out.println("�߳� " + number + ":���� " + count);
			if(++count== 6) return;
		}
	}
}
