package ʵ����װ��ģʽ;

public class Eag extends SmallMaterial{

	public Eag(Food food) {
		super(food);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void add(){
		super.add();
		addEag();
	}
	
	public void addEag(){
		System.out.println("��һ����");
	}

}
