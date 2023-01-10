package 实验二外观模式;

public class Computer implements Equipment {

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("电脑已打开");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("电脑已关闭");
	}

}
