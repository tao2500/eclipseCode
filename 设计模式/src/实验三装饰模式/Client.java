package 实验三装饰模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Food noodle,eag,beef;
		noodle = new Noodle();
		eag = new Eag(noodle);
		beef = new Beef(eag);
		beef.add();
	}

}
