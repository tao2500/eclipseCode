package 实验三桥接模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
