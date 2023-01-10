package 实验三装饰模式;

public class Prok extends SmallMaterial{

	public Prok(Food food) {
		super(food);
		// TODO 自动生成的构造函数存根
	}
	
	public void add(){
		super.add();
		addProk();
	}
	
	public void addProk(){
		System.out.println("加一份猪肉");
	}

}
