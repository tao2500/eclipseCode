package ʵ����װ��ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Food noodle,eag,beef;
		noodle = new Noodle();
		eag = new Eag(noodle);
		beef = new Beef(eag);
		beef.add();
	}

}
