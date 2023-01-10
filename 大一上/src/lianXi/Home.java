package lianXi;


public class Home extends Company{
	public void Company(Company q){
		double a2=0,a3=0,many1=0,many2=0,many3=0,total=0;
		double sum1=sum;
		if(sum>=601.00){
			a3=sum-601.00;
			sum=sum-a3;
			many3=a3*0.86;
		}
		if(sum>=261.00){
			a2=sum-261.00;
			sum=sum-a2;
			many2=a2*0.64;
		}
			many1=sum*0.56;
		total=many3+many2+many1;
		System.out.printf("该用户本月用电%10.2f度，总计费用%10.2f元\n",sum1,total);
	}
}
