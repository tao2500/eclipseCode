package lianXi;

public class Bank {
	int savedMoney;//现金
	int year;//时间
	double interest;//利息
	double interestRate=0.29;//利息
	public double computerInterest(){
		interest=year*interestRate*savedMoney;
		return interest;   //求获得年利息
	}
	public void setInterestRate(double rate){
		interestRate = rate;    //设置年利息
	}
}
