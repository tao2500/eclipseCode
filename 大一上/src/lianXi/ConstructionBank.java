package lianXi;

public class ConstructionBank extends Bank{
	double year;
	public double computerInterest(){
		super.year=(int)year;//����
		double r=year-(int)year;//����
		int day=(int)(r*1000);
		double yearInterest=super.computerInterest();   //�������Ϣ
		double dayInterest=day*0.0001*savedMoney;  //�������Ϣ
		interest=yearInterest+dayInterest;  //�������Ϣ
		System.out.printf("%dԪ���ڽ�������%d����%d�����Ϣ��%fԪ\n",savedMoney,super.year,day,interest);
		return interest;
	}
}
