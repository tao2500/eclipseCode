package 实验二适配器模式;

public class Adapter extends AbroadPayment implements Payment{

	@Override
	public void pay(double money) {
		System.out.println("支付人民币"+money+"元");
		super.payment(money);
	}

}
