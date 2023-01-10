package keben;
import java.util.Scanner;
public class E {
	public static void main (String [] args){
		Scanner abcd =new Scanner (System.in);
		System.out.println("请输入一个四位数的年份");
		int a =abcd.nextInt();
		if (a%4==0&&a%100!=0){
			System.out.println("该年份是闰年");
		}
		else if (a%400==0){
			System.out.println("该年份是闰年");
		}
		else if (a%4!=0||a%100==0){
			System.out.println("该年份不是闰年");
		}
		else if (a%400!=0){
			System.out.println("该年份不是是闰年");
		}
		
	}

}
