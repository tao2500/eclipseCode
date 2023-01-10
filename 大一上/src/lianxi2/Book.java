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
		System.out.println("这本书的名字为："+bookName+"作者是："+author+"出版社为："+press);
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
		b[0].bookName="java实用教程";
		b[0].author="作者1";
		b[0].press="清华大学出版社";
		b[1].bookName="java上机实验";
		b[1].author="作者2";
		b[1].press="清华大学出版社";
		b[2].bookName="软件工程";
		b[2].author="作者3";
		b[2].press="清华大学出版社";
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
		if(b[i].bookName.equals(bookName)==true){  //判断两个书名是否相同
			b[i].bookName=null;
			b[i].author=null;
			b[i].press=null;
			m=1;
		}
		else {
			System.out.println("该书籍不存在，删除失败");
		}
		}
		return m;
	}
}
