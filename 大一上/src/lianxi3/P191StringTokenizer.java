package lianxi3;

import java.util.StringTokenizer;

public class P191StringTokenizer {
	public static void main (String [] args){
		StringTokenizer fenxi=new StringTokenizer ("���ڳ���ʹ��java��StringTokenizer�࣬����һ���ַ���������������������","��");
		int sum=fenxi.countTokens();
		while(fenxi.hasMoreTokens()){
			String s=fenxi.nextToken();
			System.out.println(sum +" "+s);
		}
	}
}
