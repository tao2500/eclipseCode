package lianbiao;


public class Student {
	String id;
	Student next;
	String name;
	void setNext(Student next) {
		this.next=next;//������ָ����һ��ѧ��
	}
	void setId(String a) {
		id=a;
	}
	void setName(String b) {
		name=b;
	}
	String getmane() {
		return name;
	}
	String getId() {
		return id;
  
	}
	public Student getNext() {
		return next;
	}
 

}