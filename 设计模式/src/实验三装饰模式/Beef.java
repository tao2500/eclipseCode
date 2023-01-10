package 实验三装饰模式;

public class Beef extends SmallMaterial{

	public Beef(Food food) {
		super(food);
		// TODO 自动生成的构造函数存根
	}
	
	public void add(){
		super.add();
		addBeef();
	}
	
	public void addBeef(){
		System.out.println("加一份牛肉");
	}

}
