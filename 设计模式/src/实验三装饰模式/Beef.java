package ʵ����װ��ģʽ;

public class Beef extends SmallMaterial{

	public Beef(Food food) {
		super(food);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void add(){
		super.add();
		addBeef();
	}
	
	public void addBeef(){
		System.out.println("��һ��ţ��");
	}

}
