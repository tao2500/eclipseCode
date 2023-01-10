package lianxi2;
import java.util.*;
public class Test {
	public static void main(String [] args){

		Scanner s=new Scanner(System.in);
		System.out.println("请输入一段可能含有敏感词的文字");
		String ss=s.nextLine();
		Mingganci a=new Mingganci(ss);
		a.dealWith();
		//我在自由民主论坛上看到许多人宣称自己在修炼发轮功，有的人还宣称自己拥有自制手枪
	}
}
