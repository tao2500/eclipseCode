package 实验二外观模式;

public class Projector implements Equipment {

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("投影仪已打开");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("投影仪已关闭");
	}

}
