package ʵ��������ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�˿ͺ��з���Ա���");
		Waiter w = new Waiter();
		System.out.println("�˿͵���������");
		Barbecue b ;
		b = new RoastFishCommand();
		w.setBarbecue(b);
		w.order();
	}

}
