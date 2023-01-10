package 实验二外观模式;

public class Curtain implements Equipment{

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("幕布已降下");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("幕布已收回");
	}

}
