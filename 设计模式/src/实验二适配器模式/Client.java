package 实验二适配器模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Payment app = new Adapter();
		app.pay(100000);
	}

}
