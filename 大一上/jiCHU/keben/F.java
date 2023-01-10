package keben;
import java.util.Scanner;
public class F {
	public static void main (String [] args){
		Scanner abc =new Scanner (System.in);
		System.out.println("请输入一个三位数");
		int a =abc.nextInt();
		int b =a/100;  //百位
		int c=a%100/10;  //十位
		int d=a%10;    //个位
		int e =  (int)Math.pow(b,3);
		int f =  (int)Math.pow(c,3);
		int g =  (int)Math.pow(d,3);
		if (e+f+g==a){
			System.out.println(+a+"是水仙花数");
		}
		else if (e+f+g!=a){
			System.out.println(+a+"不是水仙花数");
		}
	}

}
