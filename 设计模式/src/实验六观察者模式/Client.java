package ʵ�����۲���ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Subject s = new Beauty();
		Hunter a,b;
		a = new HunterOne();
		b = new HunterTwo();
		s.addHunter(a);
		s.addHunter(b);
		s.say("�ҽ����п�");
	}

}
