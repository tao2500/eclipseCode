package lianXi;

public class Teacher extends People {
	final int sum=10 ;
	final int time=90;
	void getterName(){
		System.out.println("�ý�ʦ������Ϊ%s"+name);
	}
	void setName (String name){
		this.name=name;
	}
	void getterID(){
		System.out.println("�ý�ʦ��IDΪ%d"+ID);
	}
	void setID (int ID){
		this.ID=ID;
	}
	void getterBranch(){
		System.out.println("�ý�ʦ�Ĳ���Ϊ%s"+branch);
	}
	void setBranch (String branch){
		this.branch=branch;
	}
}


