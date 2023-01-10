package keben;

import java.util.Scanner;

public class D {
	public static void main (String args[ ]){
	Scanner abc =new Scanner (System.in);
	System.out.println("请输入一个三位数:");
	int x=abc.nextInt();
	int a=x%10;
	int b=x%100/10;
	int c=x/100;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

}
