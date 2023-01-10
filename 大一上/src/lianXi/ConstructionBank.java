package lianXi;

public class ConstructionBank extends Bank{
	double year;
	public double computerInterest(){
		super.year=(int)year;//年数
		double r=year-(int)year;//天数
		int day=(int)(r*1000);
		double yearInterest=super.computerInterest();   //求得年利息
		double dayInterest=day*0.0001*savedMoney;  //求得天利息
		interest=yearInterest+dayInterest;  //求得总利息
		System.out.printf("%d元存在建设银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
		return interest;
	}
}
