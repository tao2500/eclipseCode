package night������;
import java.util.*;

public class Student {
	String student;
	String stunumber;
	String college;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String input = sc.next();
		student = input;
		System.out.println("������ѧ��ѧ�ţ�");
		input = sc.next();
		stunumber = input;
		System.out.println("������ѧ������ѧԺ��");
		input = sc.next();
		college = input;
	}
}
