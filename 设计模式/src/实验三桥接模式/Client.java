package ʵ�����Ž�ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		show xiaochengxu,app,browser;
		MAP gaode,baidu;
		xiaochengxu = new xiaochengxu();
		gaode = new GaoDe();
		gaode.setshow(xiaochengxu);
		gaode.star();
		System.out.println("-----------------------");
		app = new app();
		gaode.setshow(app);
		gaode.star();
		System.out.println("-----------------------");
		baidu = new BaiDu();
		baidu.setshow(app);
		baidu.star();
	}

}
