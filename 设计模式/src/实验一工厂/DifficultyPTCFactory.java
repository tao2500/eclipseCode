package 实验一工厂;

public class DifficultyPTCFactory implements GameFactory{

	@Override
	public Game createGame() {
		// TODO 自动生成的方法存根
		return new DifficultyPeopleAndComputer();
	}

}
