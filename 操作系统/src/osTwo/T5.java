package osTwo;

public class T5  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
        NewThread new_thread = new NewThread(bank);
        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
	}

}
