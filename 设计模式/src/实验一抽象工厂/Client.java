package 实验一抽象工厂;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		difficultyFactory dg = null;
		Game p = null;
		dg = new EasyGameFactory();
		p = dg.createPeopleandPeople();
		p.play();
		System.out.println("-----------------");
		p = dg.createPeopleandComputer();
		p.play();
		System.out.println("-----------------");
		dg = new difficultyGameFactory();
		p = dg.createPeopleandPeople();
		p.play();
		System.out.println("-----------------");
		p = dg.createPeopleandComputer();
		p.play();
	}

}
