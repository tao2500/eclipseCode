package 实验四命令模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("顾客呼叫服务员点餐");
		Waiter w = new Waiter();
		System.out.println("顾客点了条烤鱼");
		Barbecue b ;
		b = new RoastFishCommand();
		w.setBarbecue(b);
		w.order();
	}

}
