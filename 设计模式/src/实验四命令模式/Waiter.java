package 实验四命令模式;

public class Waiter {
	private Barbecue b;
	public void setBarbecue(Barbecue b){
		this.b = b;
	}
	public void order(){
		System.out.println("服务员到摊位订餐");
		b.star();
	}
}
