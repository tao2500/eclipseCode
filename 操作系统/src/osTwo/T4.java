package osTwo;

public class T4 {
	public static void main(String[] args) {
		MyThreadd my = new MyThreadd();
//		创建进程并加入队列
	     new Thread(my, "1号窗口").start();
	     new Thread(my, "2号窗口").start();
	     new Thread(my, "3号窗口").start();
	}

}
