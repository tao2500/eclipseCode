package ʵ��һ���󹤳�;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
