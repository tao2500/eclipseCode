package ʵ�������ģʽ;

public class AcademicAffairsOffice extends Mechanism{
	String name;
	public AcademicAffairsOffice(String s){
		this.name = s;
	}
	@Override
	public void add(Mechanism m) {
		// TODO �Զ����ɵķ������
		System.out.println("ERROE: �˶���֧�ָ÷���");
	}

	@Override
	public void remove(Mechanism m) {
		// TODO �Զ����ɵķ������
		System.out.println("ERROE: �˶���֧�ָ÷���");
	}

	@Override
	public Mechanism getchlid(int i) {
		// TODO �Զ����ɵķ������
		System.out.println("ERROE: �˶���֧�ָ÷���");
		return null;
	}

	@Override
	public void work() {
		// TODO �Զ����ɵķ������
		System.out.println(name+"�����������յ�֪ͨ");
	}

}
