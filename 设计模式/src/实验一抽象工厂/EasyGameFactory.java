package 实验一抽象工厂;

public class EasyGameFactory implements difficultyFactory{

	@Override
	public Game createPeopleandComputer() {
		// TODO 自动生成的方法存根
		return new EasyPeopleAndComputer();
	}

	@Override
	public Game createPeopleandPeople() {
		// TODO 自动生成的方法存根
		return new EasyPeopleAndPeople();
	}


	

}
