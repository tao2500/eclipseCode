package lianxi2;
import java.util.*;
import java.math.*;
public class Maath {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一段包含数字的文字");
		String a=s.nextLine();
		String regex="\\D";
		String mun[]=a.split(regex);
		System.out.println("该文字中所含有的数字为：");
		double add=0,valu=0;
		for(int i=0;i<mun.length;i++){
			System.out.print(mun[i]+"  ");
			int d=Integer.parseInt(mun[i]);
			add+=d;
		}
		System.out.println();
		System.out.println("这些数字的和为："+add);
		valu=add/mun.length;
		System.out.println("这些数字的平均值为："+valu);
	}
}
