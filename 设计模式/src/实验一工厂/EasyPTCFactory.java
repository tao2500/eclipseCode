package ʵ��һ����;

public class EasyPTCFactory implements GameFactory{

	@Override
	public Game createGame() {
		// TODO �Զ����ɵķ������
		return new DifficultyPeopleAndComputer();
	}

}
