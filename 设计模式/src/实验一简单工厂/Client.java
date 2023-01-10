package 实验一简单工厂;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Game g = null;
		g = Factory.getGame("EasyPeopleAndComputer");
		g.play();
		System.out.println("-----------------");
		g = Factory.getGame("EasyPeopleAndPeople");
		g.play();
		System.out.println("-----------------");
		g = Factory.getGame("DifficultyPeopleAndComputer");
		g.play();
		System.out.println("-----------------");
		g = Factory.getGame("DifficultyPeopleAndPeople");
		g.play();
	}

}
