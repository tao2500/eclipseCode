package studentAdministration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Modify {
	public ArrayList<Student> Modify(ArrayList<Student> l,int i){
		--i;
		Scanner sca=new Scanner(System.in);
		System.out.println("1.修改学生id；2.修改学生姓名；3.修改学生电话号码；4.修改学生宿舍号；5.修改学生班级；6.修改全部；");
		int input;
		input=sca.nextInt();
		Student s=new Student();
		switch(input){ 
			case 1:
				s=l.get(i);
				System.out.println("请输入修改后学生的id");
				s.setId(sca.next());
				l.add(i, s);
				System.out.println("修改成功！");
				break;
			case 2:
				s=l.get(i);
				System.out.println("ok3");
				System.out.println("请输入修改后学生的姓名");
				s.setMane(sca.next());
				l.add(i, s);
				System.out.println("修改成功！");
				break;
			case 3:
				s=l.get(i);
				System.out.println("请输入修改后学生的联系电话");
				s.setCallphonenumber(sca.next());
				l.add(i, s);
				System.out.println("修改成功！");
				break;
			case 4:
				s=l.get(i);
				System.out.println("请输入修改后学生的宿舍号");
				s.setClassnumber(sca.next());
				l.add(i, s);
				System.out.println("修改成功！");
				break;
			case 5:
				s=l.get(i);
				System.out.println("请输入修改后学生的班级");
				s.setClassnumber(sca.next());
				l.add(i,s);
				System.out.println("修改成功！");
				break;
			case 6:
				s=l.get(i);
				System.out.println("请输入修改后学生的id");
				s.setId(sca.next());
				System.out.println("请输入修改后学生的姓名");
				s.setMane(sca.next());
				System.out.println("请输入修改后学生的联系电话");
				s.setCallphonenumber(sca.next());
				System.out.println("请输入修改后学生的宿舍号");
				s.setClassnumber(sca.next());
				System.out.println("请输入修改后学生的班级");
				s.setClassnumber(sca.next());
				l.set(i, s);
				System.out.println("修改成功！");
				break;
			default:System.out.println("输入有误，请重新输入!!!");
			++i;
			Modify mo=new Modify();
			mo.Modify(l,i);
			}
		return l;
		}
}