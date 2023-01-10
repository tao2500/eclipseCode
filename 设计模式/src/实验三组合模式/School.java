package 实验三组合模式;

import java.util.ArrayList;

public class School extends Mechanism{
	private ArrayList<Mechanism> list = new ArrayList<Mechanism>();
	String name;

	public School(String s){
		this.name = s;
	}
	@Override
	public void add(Mechanism m) {
		// TODO 自动生成的方法存根
		list.add(m);
	}

	@Override
	public void remove(Mechanism m) {
		// TODO 自动生成的方法存根
		list.remove(m);
	}

	@Override
	public Mechanism getchlid(int i) {
		// TODO 自动生成的方法存根
		return list.get(i);
	}

	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("这里是 /"+name+"/ 正在下发公文");
		for(Mechanism m : list){
			m.work();
		}
	}
}
