package keben;
import java.util.Scanner;
public class B {
	public static void main (String [] args) {
		Scanner abc =new Scanner (System.in);
		System.out.println("����������һԪ���η��̵�����");
		int a =abc.nextInt();
		int b =abc.nextInt();
		int c =abc.nextInt();
		int l =b*b-4*a*c;
		if (l>=0){
		    System.out.println("�����н�");
		}
		if (l<0){
			System.out.println("�����޽�");
		}
	}

}
