package night新特性;
import java.util.*;
public class Lambdaa {

	public static void main(String [] args) {
		// TODO 自动生成的方法存根
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
//		String[][] studentt = {{st1.student,st1.stunumber,st1.college},{st2.student,st2.stunumber,st2.college},{st3.student,st3.stunumber,st3.college}};
//		String [] stnum = {studentt[0][1],studentt[1][1],studentt[2][1]};
		List<Student> arraylist = new ArrayList<Student>();
		arraylist.add(st1);
		arraylist.add(st2);
		arraylist.add(st3);
		System.out.println("按学号进行降序排序后的结果如下");
		Collections.sort(arraylist,(a,b)->a.stunumber.compareTo(b.student));
		arraylist.forEach((i) -> System.out.println("姓名为："+i.student+"学号为："+i.stunumber+"学院为："+i.college));
		}
	}


