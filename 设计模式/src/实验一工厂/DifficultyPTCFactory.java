package ʵ��һ����;

public class DifficultyPTCFactory implements GameFactory{

	@Override
	public Game createGame() {
		// TODO �Զ����ɵķ������
		return new DifficultyPeopleAndComputer();
	}

}
