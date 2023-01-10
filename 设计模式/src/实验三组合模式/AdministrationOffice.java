package 实验三组合模式;

public class AdministrationOffice extends Mechanism{
	String name;
	public AdministrationOffice(String s){
		this.name = s;
	}
	@Override
	public void add(Mechanism m) {
		// TODO 自动生成的方法存根
		System.out.println("ERROE: 此对象不支持该方法");
	}

	@Override
	public void remove(Mechanism m) {
		// TODO 自动生成的方法存根
		System.out.println("ERROE: 此对象不支持该方法");
	}

	@Override
	public Mechanism getchlid(int i) {
		// TODO 自动生成的方法存根
		System.out.println("ERROE: 此对象不支持该方法");
		return null;
	}

	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println(name+"教务办公室已收到通知");
	}

}
