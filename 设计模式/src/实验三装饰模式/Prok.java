package ʵ����װ��ģʽ;

public class Prok extends SmallMaterial{

	public Prok(Food food) {
		super(food);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void add(){
		super.add();
		addProk();
	}
	
	public void addProk(){
		System.out.println("��һ������");
	}

}
