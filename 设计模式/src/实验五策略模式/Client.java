package ʵ�������ģʽ;

public class Client {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Context con = new Context();
		Strategy st;
		st=new methodOne();
		con.setStrategy(st);
		con.star();
	}

}
