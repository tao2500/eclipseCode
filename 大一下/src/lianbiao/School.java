package lianbiao;

import java.util.Scanner;
public class School {
	Student m=new Student();
	Student p=null;
	void createlist() {
		Scanner input=new Scanner(System.in);
		Student q=null;
		Student l,t;
		System.out.println("请依次输入学生的学号与姓名，敲回车键确定。");
		System.out.println("连续输入两次“-1”结束输入资料，敲回车键确定。");
		String id=input.next();
		String name=input.next();
		while(!id.equals("-1")) {
			t=new Student();
			t.id=id;
			t.name=name;
			if(p==null) {
				p=t;
				q=t;
			}
			else {
				q.setNext(t);//连接两个节点
				q=t;
	  }
			id=input.next();
			name=input.next();//重新输入新学生
		}
	}
	void print () {
		Student q=p;//使q指向第一个节点
		while(q!=null) {
			System.out.println(q.name);
			q=q.next;//q指向下一个节点
		}
	}
	
	void seekStudent(String name1){
		Student q=p;
		while(q!=null) {

			if (!q.name.equals(name1)){
				q=q.next;
			}
			else {
				System.out.println("该学生的学号为"+q.id);
				break;
			}
		}
	}
	public static void main (String args[]) {
		Scanner input1=new Scanner(System.in);
		School t=new School();
		t.createlist();
		t.print();
		System.out.println("请输入要查询的学生的姓名，按回车键确认。");
		String name=input1.next();
		t.seekStudent(name);
	}
}