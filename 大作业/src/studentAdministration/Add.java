package studentAdministration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Add {
	Scanner sca=new Scanner(System.in);
	Student s=new Student();
	Add(){
		System.out.println("�������ѧ����id");
		s.setId(sca.next());
		System.out.println("�������ѧ��������");
		s.setMane(sca.next());
		System.out.println("�������ѧ������ϵ�绰");
		s.setCallphonenumber(sca.next());
		System.out.println("�������ѧ���������");
		s.setDormitorynumber(sca.next());
		System.out.println("�������ѧ���İ༶");
		s.setClassnumber(sca.next());
	}
	public ArrayList returnn(ArrayList<Student> l){
		l.add(s);
		System.out.println("������ӳɹ���");
		return l;
		
	}
}
