package lianXi;

public class Student extends People {
	final int sum=8;
	final int time=60;
	void getterName(){
		System.out.println("��ѧ��������Ϊ%s"+name);
	}
	void setName (String name){
		this.name=name;
	}
	void getterID(){
		System.out.println("��ѧ����IDΪ%d"+ID);
	}
	void setID (int ID){
		this.ID=ID;
	}
	void getterBranch(){
		System.out.println("��ѧ���Ĳ���Ϊ%s"+branch);
	}
	void setBranch (String branch){
		this.branch=branch;
	}
}
