package ʵ�������ģʽ;

import java.util.ArrayList;

public class School extends Mechanism{
	private ArrayList<Mechanism> list = new ArrayList<Mechanism>();
	String name;

	public School(String s){
		this.name = s;
	}
	@Override
	public void add(Mechanism m) {
		// TODO �Զ����ɵķ������
		list.add(m);
	}

	@Override
	public void remove(Mechanism m) {
		// TODO �Զ����ɵķ������
		list.remove(m);
	}

	@Override
	public Mechanism getchlid(int i) {
		// TODO �Զ����ɵķ������
		return list.get(i);
	}

	@Override
	public void work() {
		// TODO �Զ����ɵķ������
		System.out.println("������ /"+name+"/ �����·�����");
		for(Mechanism m : list){
			m.work();
		}
	}
}
