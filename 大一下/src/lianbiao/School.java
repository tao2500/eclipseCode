package lianbiao;

import java.util.Scanner;
public class School {
	Student m=new Student();
	Student p=null;
	void createlist() {
		Scanner input=new Scanner(System.in);
		Student q=null;
		Student l,t;
		System.out.println("����������ѧ����ѧ�����������ûس���ȷ����");
		System.out.println("�����������Ρ�-1�������������ϣ��ûس���ȷ����");
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
				q.setNext(t);//���������ڵ�
				q=t;
	  }
			id=input.next();
			name=input.next();//����������ѧ��
		}
	}
	void print () {
		Student q=p;//ʹqָ���һ���ڵ�
		while(q!=null) {
			System.out.println(q.name);
			q=q.next;//qָ����һ���ڵ�
		}
	}
	
	void seekStudent(String name1){
		Student q=p;
		while(q!=null) {

			if (!q.name.equals(name1)){
				q=q.next;
			}
			else {
				System.out.println("��ѧ����ѧ��Ϊ"+q.id);
				break;
			}
		}
	}
	public static void main (String args[]) {
		Scanner input1=new Scanner(System.in);
		School t=new School();
		t.createlist();
		t.print();
		System.out.println("������Ҫ��ѯ��ѧ�������������س���ȷ�ϡ�");
		String name=input1.next();
		t.seekStudent(name);
	}
}