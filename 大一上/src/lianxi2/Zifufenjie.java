package lianxi2;
import java.util.Scanner;
public class Zifufenjie {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("������һ�θ��ַ��ŵ��ַ���");
		String a=s.nextLine();
		String regex="\\D{2,}";
		String digitWord[]=a.split(regex);
		System.out.println("���ַ����е������У�");
		for(int i=0;i<digitWord.length;i++){
			System.out.print("   "+digitWord[i]);
		}

	}
}
