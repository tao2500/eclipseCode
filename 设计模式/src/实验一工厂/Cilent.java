package ʵ��һ����;

public class Cilent {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
