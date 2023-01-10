package 实验五策略模式;

public class Client {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Context con = new Context();
		Strategy st;
		st=new methodOne();
		con.setStrategy(st);
		con.star();
	}

}
