package night������;
import java.util.*;
public class Lambdaa {

	public static void main(String [] args) {
		// TODO �Զ����ɵķ������
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
//		String[][] studentt = {{st1.student,st1.stunumber,st1.college},{st2.student,st2.stunumber,st2.college},{st3.student,st3.stunumber,st3.college}};
//		String [] stnum = {studentt[0][1],studentt[1][1],studentt[2][1]};
		List<Student> arraylist = new ArrayList<Student>();
		arraylist.add(st1);
		arraylist.add(st2);
		arraylist.add(st3);
		System.out.println("��ѧ�Ž��н��������Ľ������");
		Collections.sort(arraylist,(a,b)->a.stunumber.compareTo(b.student));
		arraylist.forEach((i) -> System.out.println("����Ϊ��"+i.student+"ѧ��Ϊ��"+i.stunumber+"ѧԺΪ��"+i.college));
		}
	}


