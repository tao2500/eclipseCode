package lianxi2;

public class Mingganci {
	String s;
	Mingganci(String ss){
		s=ss;
	}
	public void dealWith(){
		String regex="发轮功|自由民主论坛|自制手枪";
		String dealWith=s.replaceAll(regex,"***");
		System.out.println("脱敏后输出的内容为："+dealWith);//不能直接输出s 因为字符串常量不变
	}
}
