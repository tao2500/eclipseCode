package lianXi;

public class Employee {
	public String name;        //收款人姓名
	private double salary;    //收取工资

	Employee(){
	name=null;
	salary=0;
}
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	double calSalary(double a){  //表示扣款
		double b=salary-a;
		return b;
	}
}
