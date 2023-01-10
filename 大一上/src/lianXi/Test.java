package lianXi;
import java.util.Scanner;
class Test {
	public static void main (String [] args){
		Scanner abcd =new Scanner (System.in);
		Teacher a=new Teacher();
		Student b=new Student();
		System.out.println("请分别输入该同学的姓名，学号，院校");
		String na=abcd.next();
		b.setName(na);
		int su=abcd.nextInt();
		b.setID(su);
		String bran =abcd.next();
		b.setBranch(bran);
		System.out.println("请分别输入该教师的姓名，工号，部门");
		String na1=abcd.next();
		a.setName(na1);
		int su1=abcd.nextInt();
		a.setID(su1);
		String bran1 =abcd.next();
		a.setBranch(bran1);
		
		System.out.println("该学生的姓名为"+b.name);
		System.out.println("该学生的学号为"+b.ID);
		System.out.println("该学生所在的院校为"+b.branch);
		System.out.println("该学生能借的书本数为"+b.sum);
		System.out.println("该学生借书的期限为天"+b.time);
		
		System.out.println("该教师的姓名为"+a.name);
		System.out.println("该教师的工号为"+a.ID);
		System.out.println("该教师所在的部门为"+a.branch);
		System.out.println("该教师能借的书本数为"+a.sum);
		System.out.println("该教师借书的期限为天"+a.time);
		

	}

}
