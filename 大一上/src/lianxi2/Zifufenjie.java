package lianxi2;
import java.util.Scanner;
public class Zifufenjie {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一段各种符号的字符串");
		String a=s.nextLine();
		String regex="\\D{2,}";
		String digitWord[]=a.split(regex);
		System.out.println("该字符串中的数字有：");
		for(int i=0;i<digitWord.length;i++){
			System.out.print("   "+digitWord[i]);
		}

	}
}
