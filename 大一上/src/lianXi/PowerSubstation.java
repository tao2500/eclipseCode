package lianXi;
import java.util.Scanner;


public class PowerSubstation  {
	public static void main(String [] args){
		Company c=new Company();
		Company com1=new Home();
		Company com2=new Shop();
		Scanner a=new Scanner(System.in);
		System.out.println("请输入用户/商户的用电量");
		double sum1=a.nextDouble();
		double sum2=a.nextDouble();
		com1.sum=sum1;
		c.Company(com1);
		com2.sum=sum2;
		c.Company(com2);
	}
}
