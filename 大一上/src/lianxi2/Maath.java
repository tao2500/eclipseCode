package lianxi2;
import java.util.*;
import java.math.*;
public class Maath {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("������һ�ΰ������ֵ�����");
		String a=s.nextLine();
		String regex="\\D";
		String mun[]=a.split(regex);
		System.out.println("�������������е�����Ϊ��");
		double add=0,valu=0;
		for(int i=0;i<mun.length;i++){
			System.out.print(mun[i]+"  ");
			int d=Integer.parseInt(mun[i]);
			add+=d;
		}
		System.out.println();
		System.out.println("��Щ���ֵĺ�Ϊ��"+add);
		valu=add/mun.length;
		System.out.println("��Щ���ֵ�ƽ��ֵΪ��"+valu);
	}
}
