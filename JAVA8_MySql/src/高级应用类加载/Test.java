package 高级应用类加载;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.mysql.cj.result.Field;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Class sd = Student.class;
		try {
			Constructor<Student> stu = sd.getDeclaredConstructor();
			
			java.lang.reflect.Field[] fiel = sd.getDeclaredFields();
			System.out.println("Student类的属性有");
			for(java.lang.reflect.Field f : fiel){
				System.out.println(f.getName());
			}
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Student studen = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("请分别输入学生的姓名、年级、所属学院");
		String input = sc.next();
		studen.setName(input);
		String ininput = sc.next();
		studen.setClassroom(ininput);
		String inputt = sc.next();
		studen.setCollege(inputt);
		System.out.println("数据写入成功！");
		System.out.println();
		System.out.println("Student中定义的方法有;");
		Method[] mt = sd.getMethods();
		for(Method me : mt){
			System.out.println(me.getName());
			if(me.getName().equals("setClassroom")){
				try {
					me.invoke(studen, "25");   //新增方法
				} catch (IllegalAccessException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		System.out.println("已设置该生年级为25");
	}

}
