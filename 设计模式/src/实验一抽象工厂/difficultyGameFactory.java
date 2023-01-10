package 实验一抽象工厂;

public class difficultyGameFactory implements difficultyFactory{

	public Game createPeopleandComputer() {
		// TODO 自动生成的方法存根
		return new DifficultyPeopleAndComputer();
	}

	@Override
	public Game createPeopleandPeople() {
		// TODO 自动生成的方法存根
		return new DifficultyPeopleAndPeople();
	}

}
