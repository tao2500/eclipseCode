package ʵ���������ģʽ;

public class Adapter extends AbroadPayment implements Payment{

	@Override
	public void pay(double money) {
		System.out.println("֧�������"+money+"Ԫ");
		super.payment(money);
	}

}
