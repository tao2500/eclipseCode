package �߼�Ӧ�������;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.mysql.cj.result.Field;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Class sd = Student.class;
		try {
			Constructor<Student> stu = sd.getDeclaredConstructor();
			
			java.lang.reflect.Field[] fiel = sd.getDeclaredFields();
			System.out.println("Student���������");
			for(java.lang.reflect.Field f : fiel){
				System.out.println(f.getName());
			}
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		Student studen = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("��ֱ�����ѧ�����������꼶������ѧԺ");
		String input = sc.next();
		studen.setName(input);
		String ininput = sc.next();
		studen.setClassroom(ininput);
		String inputt = sc.next();
		studen.setCollege(inputt);
		System.out.println("����д��ɹ���");
		System.out.println();
		System.out.println("Student�ж���ķ�����;");
		Method[] mt = sd.getMethods();
		for(Method me : mt){
			System.out.println(me.getName());
			if(me.getName().equals("setClassroom")){
				try {
					me.invoke(studen, "25");   //��������
				} catch (IllegalAccessException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		System.out.println("�����ø����꼶Ϊ25");
	}

}
