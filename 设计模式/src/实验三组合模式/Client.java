package 实验三组合模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Mechanism school1,school2,school3,school4,aao1,aao2,aao3,aao4,ao1,ao2,ao3,ao4;
		school1 = new School("北京总部");
		school2 = new School("湖南分校");
		school3 = new School("长沙教学点");
		school4 = new School("湘潭教学点");
		aao1 = new AcademicAffairsOffice("北京总部");
		aao2 = new AcademicAffairsOffice("湖南分校");
		aao3 = new AcademicAffairsOffice("长沙教学点");
		aao4 = new AcademicAffairsOffice("湘潭教学点");
		ao1 = new AdministrationOffice("北京总部");
		ao2 = new AdministrationOffice("湖南分校");
		ao3 = new AdministrationOffice("长沙教学点");
		ao4 = new AdministrationOffice("湘潭教学点");
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
