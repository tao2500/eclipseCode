package osTwo;

public class T4 {
	public static void main(String[] args) {
		MyThreadd my = new MyThreadd();
//		�������̲��������
	     new Thread(my, "1�Ŵ���").start();
	     new Thread(my, "2�Ŵ���").start();
	     new Thread(my, "3�Ŵ���").start();
	}

}
