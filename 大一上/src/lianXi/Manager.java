package lianXi;


public class Manager extends Employee {
	private String allowance;    //��ʾ����
	Manager(String name,double salary,String allowance){
		super(name,salary);
		this.allowance=allowance;
	}
	double calSalary(double a){
		double all=Double.parseDouble(allowance);
		double c=super.calSalary(a)+all;
		return c;
	}
	
	public static void main(String [] args){
		Employee e1=new Employee("liu",10000.00);
		Employee e2=new Manager("qin",20000.00,"100.25");
		System.out.println(""+e1.name+"�Ĺ���Ϊ"+e1.calSalary(150));
		System.out.println(""+e2.name+"�Ĺ���Ϊ"+e2.calSalary(200));
	}
}
