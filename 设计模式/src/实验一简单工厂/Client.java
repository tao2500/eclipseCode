package ʵ��һ�򵥹���;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
