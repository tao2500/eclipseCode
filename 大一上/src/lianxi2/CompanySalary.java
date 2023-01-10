package lianxi2;

abstract class Employee{
	public abstract double enarnings();
}
class YearWorker extends Employee{
	public double enarnings(){
		return 52*7*300;
	}
	//1 一年52周
}
class MonthWorker extends Employee{
	public double enarnings(){
		return 4*7*300;
	}
	//2 月薪=一周*4
}
class WeekWorker extends Employee{
	public double enarnings(){
		return 7*300;
	}
	//3 一周2100  一天300
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
		Employee [] employee = new Employee[29];//公司有29人
		for(int i=0;i<employee.length;i++){  //将雇员分为三级
			if(i%3==0)
				employee[i]=new WeekWorker();   //周工
			else if(i%3==1)
				employee[i]=new MonthWorker();  //月工
			else if (i%3==2)
				employee[i]=new YearWorker();   //年工
		}
		Company company = new Company(employee);
		System.out.println("公司薪水总额："+company.salariesPay()+"元");
	}
}
