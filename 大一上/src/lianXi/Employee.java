package lianXi;

public class Employee {
	public String name;        //�տ�������
	private double salary;    //��ȡ����

	Employee(){
	name=null;
	salary=0;
}
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	double calSalary(double a){  //��ʾ�ۿ�
		double b=salary-a;
		return b;
	}
}
