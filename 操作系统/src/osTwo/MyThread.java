package osTwo;

class MyThread implements Runnable {
	int count=1, number;
	public MyThread(int num) {
		number = num;
		System.out.println("创建线程 " + number);
	}
	public void run() {//实现了接口的run()方法
		while(true) {
			System.out.println("线程 " + number + ":计数 " + count);
			if(++count== 6) return;
		}
	}
}
