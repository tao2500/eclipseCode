package keben;
import java.util.Scanner;
public class E {
	public static void main (String [] args){
		Scanner abcd =new Scanner (System.in);
		System.out.println("������һ����λ�������");
		int a =abcd.nextInt();
		if (a%4==0&&a%100!=0){
			System.out.println("�����������");
		}
		else if (a%400==0){
			System.out.println("�����������");
		}
		else if (a%4!=0||a%100==0){
			System.out.println("����ݲ�������");
		}
		else if (a%400!=0){
			System.out.println("����ݲ���������");
		}
		
	}

}
