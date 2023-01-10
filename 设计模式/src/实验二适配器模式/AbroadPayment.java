package 实验二适配器模式;

public class AbroadPayment {
	public void payment(double money){
		double dollar = money/6.2;
		System.out.println("使用美元支付："+dollar+"$");
	}
}
