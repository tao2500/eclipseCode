package dongri;

public class Student {
	String mane;
	int studentnumber;
	String porfession;
	void setsm(int studentnumber1,String mane2){
		studentnumber=studentnumber1;
		mane=mane2;
	}
	void setsmp(int studentnumber1,String mane2,String porfession3){
		studentnumber=studentnumber1;
		mane=mane2;
		porfession=porfession3;
	}
	void print(){
		System.out.println(studentnumber);
		System.out.println(mane);
		System.out.println(porfession);
	}
	boolean search(String mane1){
		if(mane==mane1){
			return true;
		}
		else{
		return false;
		}
	}
	boolean search(String mane1,String porfession2){
		if(mane==mane1&&porfession==porfession2){
			return true;
		}
		else{ 
			return false;
		}
	}
}


class Demo{
	public static void main(String[]args){
		Student a=new Student();
		a.setsmp(001, "王建", "计算机科学与技术");
		//在下行代码的""中间输入要查询的名字。
		boolean q= a.search("王建");
		if(q==true){
			a.print();
		}
		else {
			System.out.println("所查询的学生不存在");
		}
	}
}
