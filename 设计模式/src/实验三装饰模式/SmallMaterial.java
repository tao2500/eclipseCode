package ʵ����װ��ģʽ;

public class SmallMaterial extends Food{
	private Food food;
	public SmallMaterial(Food food){
		this.food = food;
	}
	@Override
	public void add() {
		// TODO �Զ����ɵķ������
		food.add();
	}

}
