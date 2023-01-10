package 实验三装饰模式;

public class SmallMaterial extends Food{
	private Food food;
	public SmallMaterial(Food food){
		this.food = food;
	}
	@Override
	public void add() {
		// TODO 自动生成的方法存根
		food.add();
	}

}
