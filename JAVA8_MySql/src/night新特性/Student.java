package night新特性;
import java.util.*;

public class Student {
	String student;
	String stunumber;
	String college;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名！");
		String input = sc.next();
		student = input;
		System.out.println("请输入学生学号！");
		input = sc.next();
		stunumber = input;
		System.out.println("请输入学生所在学院！");
		input = sc.next();
		college = input;
	}
}
