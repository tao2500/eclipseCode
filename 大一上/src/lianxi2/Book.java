package lianxi2;

public class Book {
	String bookName;
	String author;
	String press;
	Book(String bookName,String author,String press){
		this.bookName= bookName;
		this.author=author;
		this.press=press;
	}
	public void getBook(){
		System.out.println("�Ȿ�������Ϊ��"+bookName+"�����ǣ�"+author+"������Ϊ��"+press);
	}
	public void setBook(String bookName,String author,String press){
		this.bookName= bookName;
		this.author=author;
		this.press=press;
	}
	public static void main (String []args){
		BookMAnager a=new BookMAnager();
		
	}
}

interface IManager{
	public abstract int findBook(String bookName);
	public abstract int addBook(String bookName,String author,String press);
	public abstract int deleteBook(String bookName);
}

class BookMAnager implements IManager{
	Book b[]=new Book[20];
	Book addb[]=new Book [1];
	BookMAnager(){
		b[0].bookName="javaʵ�ý̳�";
		b[0].author="����1";
		b[0].press="�廪��ѧ������";
		b[1].bookName="java�ϻ�ʵ��";
		b[1].author="����2";
		b[1].press="�廪��ѧ������";
		b[2].bookName="�������";
		b[2].author="����3";
		b[2].press="�廪��ѧ������";
	}
	public int findBook(String bookName){
		for(int i=0;i<b.length;i++){
			if(b[i]!=null&&b[i].bookName.equals(bookName)==true){
				return i;
			}
		}
		return 0;
	}
	public int addBook(String bookName,String author,String press){
		addb[0].bookName=bookName;
		addb[0].author=author;
		addb[0].press=press;
		for(int i=0;i<b.length;i++){
			if(b[i]==null){
				b[i]=addb[0];
				return i;
			}
		}
		return 0;
	}
	public int deleteBook(String bookName){
		int m=0;
		for(int i=0;i<b.length;i++){
		if(b[i].bookName.equals(bookName)==true){  //�ж����������Ƿ���ͬ
			b[i].bookName=null;
			b[i].author=null;
			b[i].press=null;
			m=1;
		}
		else {
			System.out.println("���鼮�����ڣ�ɾ��ʧ��");
		}
		}
		return m;
	}
}
