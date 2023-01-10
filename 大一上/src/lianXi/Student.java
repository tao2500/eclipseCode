package lianXi;

public class Student extends People {
	final int sum=8;
	final int time=60;
	void getterName(){
		System.out.println("该学生的名字为%s"+name);
	}
	void setName (String name){
		this.name=name;
	}
	void getterID(){
		System.out.println("该学生的ID为%d"+ID);
	}
	void setID (int ID){
		this.ID=ID;
	}
	void getterBranch(){
		System.out.println("该学生的部门为%s"+branch);
	}
	void setBranch (String branch){
		this.branch=branch;
	}
}
