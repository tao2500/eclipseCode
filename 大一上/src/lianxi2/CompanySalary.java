package lianxi2;

abstract class Employee{
	public abstract double enarnings();
}
class YearWorker extends Employee{
	public double enarnings(){
		return 52*7*300;
	}
	//1 һ��52��
}
class MonthWorker extends Employee{
	public double enarnings(){
		return 4*7*300;
	}
	//2 ��н=һ��*4
}
class WeekWorker extends Employee{
	public double enarnings(){
		return 7*300;
	}
	//3 һ��2100  һ��300
}
class Company{
	Employee [] employee;
	double salaries=0;
	Company(Employee[] employee){
		this.employee=employee;
	}
	public double salariesPay(){
		salaries=0;
		for(int i=0;i<employee.length;i++){
			salaries=salaries+employee[i].enarnings();
		}
		return salaries;
	}
}

public class CompanySalary {
	public static void main(String[]args){
		Employee [] employee = new Employee[29];//��˾��29��
		for(int i=0;i<employee.length;i++){  //����Ա��Ϊ����
			if(i%3==0)
				employee[i]=new WeekWorker();   //�ܹ�
			else if(i%3==1)
				employee[i]=new MonthWorker();  //�¹�
			else if (i%3==2)
				employee[i]=new YearWorker();   //�깤
		}
		Company company = new Company(employee);
		System.out.println("��˾нˮ�ܶ"+company.salariesPay()+"Ԫ");
	}
}
