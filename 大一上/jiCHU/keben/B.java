package keben;
import java.util.Scanner;
public class B {
	public static void main (String [] args) {
		Scanner abc =new Scanner (System.in);
		System.out.println("请依次输入一元二次方程的序数");
		int a =abc.nextInt();
		int b =abc.nextInt();
		int c =abc.nextInt();
		int l =b*b-4*a*c;
		if (l>=0){
		    System.out.println("方程有解");
		}
		if (l<0){
			System.out.println("方程无解");
		}
	}

}
