package 实验二外观模式;

public class BlackboardLight implements Equipment {

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("黑板灯已开启");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("黑板灯已关闭");
	}

}
