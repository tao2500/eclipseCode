package 实验三装饰模式;

public class Eag extends SmallMaterial{

	public Eag(Food food) {
		super(food);
		// TODO 自动生成的构造函数存根
	}
	
	public void add(){
		super.add();
		addEag();
	}
	
	public void addEag(){
		System.out.println("加一个蛋");
	}

}
