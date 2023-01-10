package lianxi2;

public class School {

	public static void main(String[] args) {
		Student stu = new  Student();
		stu.setSchoolNum("202010098231");
		stu.setCelephoneNumber("13138047389");
		stu.setName("刘五");
		stu.setCollege("计算机工程学院");
		stu.setEmail("2500594038@qq.com");
		stu.toString(stu);
		stu.pdxh(stu.schoolNum);
		stu.pddh(stu.celephoneNumber);
		stu.pdyx(stu.email);
		boolean qq=true;
		boolean ww=false;
		}
	}


