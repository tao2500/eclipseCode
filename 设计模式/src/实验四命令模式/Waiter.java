package ʵ��������ģʽ;

public class Waiter {
	private Barbecue b;
	public void setBarbecue(Barbecue b){
		this.b = b;
	}
	public void order(){
		System.out.println("����Ա��̯λ����");
		b.star();
	}
}
