package DuoXianCheng;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread1 thread1=new Thread1();
		Thread Th1=new Thread(thread1);//�����߳�
		Th1.setName("�߳�1");
		System.out.println(Th1.getName());//��ȡ�̵߳�����
		System.out.println(Thread.currentThread().getName());//��ȡ���̵߳�����P367
		Th1.start();
	}

}
