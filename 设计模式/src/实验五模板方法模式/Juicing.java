package ʵ����ģ�巽��ģʽ;

public abstract class Juicing {
	
	public void cut(){
		System.out.println("���ڰ�ˮ����Ƭ");
	}
	public void push(){
		System.out.println("���ڰ��кõ�ˮ������ե֭��");
	}
	public abstract void addFruit();
	public void Star(){
		System.out.println("ե֭����ʼ����");
	}
	public void handle(){
		cut();
		push();
		addFruit();
		Star();
	}
	
}
