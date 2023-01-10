package lianxi3;

import java.util.StringTokenizer;

public class P191StringTokenizer {
	public static void main (String [] args){
		StringTokenizer fenxi=new StringTokenizer ("我在尝试使用java的StringTokenizer类，他是一个字符串分析器，我想掌握它","，");
		int sum=fenxi.countTokens();
		while(fenxi.hasMoreTokens()){
			String s=fenxi.nextToken();
			System.out.println(sum +" "+s);
		}
	}
}
