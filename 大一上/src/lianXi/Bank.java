package lianXi;

public class Bank {
	int savedMoney;//�ֽ�
	int year;//ʱ��
	double interest;//��Ϣ
	double interestRate=0.29;//��Ϣ
	public double computerInterest(){
		interest=year*interestRate*savedMoney;
		return interest;   //��������Ϣ
	}
	public void setInterestRate(double rate){
		interestRate = rate;    //��������Ϣ
	}
}
