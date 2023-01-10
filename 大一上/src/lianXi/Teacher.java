package lianXi;

public class Teacher extends People {
	final int sum=10 ;
	final int time=90;
	void getterName(){
		System.out.println("该教师的名字为%s"+name);
	}
	void setName (String name){
		this.name=name;
	}
	void getterID(){
		System.out.println("该教师的ID为%d"+ID);
	}
	void setID (int ID){
		this.ID=ID;
	}
	void getterBranch(){
		System.out.println("该教师的部门为%s"+branch);
	}
	void setBranch (String branch){
		this.branch=branch;
	}
}


