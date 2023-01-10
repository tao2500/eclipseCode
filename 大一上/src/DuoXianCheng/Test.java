package DuoXianCheng;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread1 thread1=new Thread1();
		Thread Th1=new Thread(thread1);//创建线程
		Th1.setName("线程1");
		System.out.println(Th1.getName());//获取线程的名字
		System.out.println(Thread.currentThread().getName());//获取本线程的名字P367
		Th1.start();
	}

}
