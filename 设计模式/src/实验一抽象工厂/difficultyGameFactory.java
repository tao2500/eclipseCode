package ʵ��һ���󹤳�;

public class difficultyGameFactory implements difficultyFactory{

	public Game createPeopleandComputer() {
		// TODO �Զ����ɵķ������
		return new DifficultyPeopleAndComputer();
	}

	@Override
	public Game createPeopleandPeople() {
		// TODO �Զ����ɵķ������
		return new DifficultyPeopleAndPeople();
	}

}
