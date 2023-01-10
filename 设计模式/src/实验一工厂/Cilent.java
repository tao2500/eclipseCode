package 实验一工厂;

public class Cilent {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GameFactory gf = null;
		Game g = null;
		gf = new DifficultyPTCFactory();
		g = gf.createGame();
		g.play();
		System.out.println("------------------");
		gf = new DifficultyPTPFactory();
		g = gf.createGame();
		g.play();
		System.out.println("------------------");
		gf = new EasyPTCFactory();
		g = gf.createGame();
		g.play();
		System.out.println("------------------");
		gf = new EasyPTPFactory();
		g = gf.createGame();
		g.play();
		System.out.println("------------------");
	}

}
