package keben;
import java.util.Scanner;
public class F {
	public static void main (String [] args){
		Scanner abc =new Scanner (System.in);
		System.out.println("������һ����λ��");
		int a =abc.nextInt();
		int b =a/100;  //��λ
		int c=a%100/10;  //ʮλ
		int d=a%10;    //��λ
		int e =  (int)Math.pow(b,3);
		int f =  (int)Math.pow(c,3);
		int g =  (int)Math.pow(d,3);
		if (e+f+g==a){
			System.out.println(+a+"��ˮ�ɻ���");
		}
		else if (e+f+g!=a){
			System.out.println(+a+"����ˮ�ɻ���");
		}
	}

}
