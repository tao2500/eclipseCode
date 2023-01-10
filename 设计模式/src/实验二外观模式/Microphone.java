package 实验二外观模式;

public class Microphone implements Equipment{

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("话筒已通电");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("话筒已断电");
	}

}
