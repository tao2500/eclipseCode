package studentAdministration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Add {
	Scanner sca=new Scanner(System.in);
	Student s=new Student();
	Add(){
		System.out.println("请输入该学生的id");
		s.setId(sca.next());
		System.out.println("请输入该学生的姓名");
		s.setMane(sca.next());
		System.out.println("请输入该学生的联系电话");
		s.setCallphonenumber(sca.next());
		System.out.println("请输入该学生的宿舍号");
		s.setDormitorynumber(sca.next());
		System.out.println("请输入该学生的班级");
		s.setClassnumber(sca.next());
	}
	public ArrayList returnn(ArrayList<Student> l){
		l.add(s);
		System.out.println("数据添加成功！");
		return l;
		
	}
}
