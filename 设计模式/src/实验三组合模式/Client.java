package ʵ�������ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Mechanism school1,school2,school3,school4,aao1,aao2,aao3,aao4,ao1,ao2,ao3,ao4;
		school1 = new School("�����ܲ�");
		school2 = new School("���Ϸ�У");
		school3 = new School("��ɳ��ѧ��");
		school4 = new School("��̶��ѧ��");
		aao1 = new AcademicAffairsOffice("�����ܲ�");
		aao2 = new AcademicAffairsOffice("���Ϸ�У");
		aao3 = new AcademicAffairsOffice("��ɳ��ѧ��");
		aao4 = new AcademicAffairsOffice("��̶��ѧ��");
		ao1 = new AdministrationOffice("�����ܲ�");
		ao2 = new AdministrationOffice("���Ϸ�У");
		ao3 = new AdministrationOffice("��ɳ��ѧ��");
		ao4 = new AdministrationOffice("��̶��ѧ��");
		school1.add(aao1);
		school1.add(ao1);
		school1.add(school2);
		school2.add(aao2);
		school2.add(ao2);
		school2.add(school3);
		school2.add(school4);
		school3.add(ao3);
		school3.add(aao3);
		school4.add(ao4);
		school4.add(aao4);
		
		school1.work();
	}
}
