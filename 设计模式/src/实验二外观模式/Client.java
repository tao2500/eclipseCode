package 实验二外观模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Facade fa = new Facade();
		fa.open();
		System.out.println(".......................");
		fa.off();
	}

}
