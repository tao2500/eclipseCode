package ʵ��һ���󹤳�;

public class EasyGameFactory implements difficultyFactory{

	@Override
	public Game createPeopleandComputer() {
		// TODO �Զ����ɵķ������
		return new EasyPeopleAndComputer();
	}

	@Override
	public Game createPeopleandPeople() {
		// TODO �Զ����ɵķ������
		return new EasyPeopleAndPeople();
	}


	

}
