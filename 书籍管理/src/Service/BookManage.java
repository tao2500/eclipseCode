package Service;
import Impl.IBookManage;
import java.io.*;
import Beans.Book;

public class BookManage implements IBookManage {
	FileReader input;
	BufferedReader inpu;
	String BookName;
	public BookManage(String BookName){
		this.BookName=BookName;
		init();
	}
	public void init(){
		try{
			input=new FileReader("D://javacopytest//wendang.txt");
			inpu=new BufferedReader(input);
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
	}
	
	public int getNumOfBooks(){
		int num=0;
		String s=null;
		try{
			while((s=inpu.readLine())!=null){
				num++;
		}
		}
		catch(IOException e){
		}
		return num;
	}
	
	
	public Book[] getAllBook(){
		int num=getNumOfBooks();
		int i=0;
		Book [] book=new Book[num];
		init();
		String s;
		try{
			while((s=inpu.readLine())!=null){
				String ss[]=s.split(",");
				book[i].setBookName(ss[0]);
				book[i].setAuthor(ss[1]);
				book[i].setPrice(Float.parseFloat(ss[2]));
				book[i].setPress(ss[3]);
				i++;
		}
			inpu.close();
			input.close();
		}
			catch(IOException e){
				e.printStackTrace();
			}
		return book;
		}
		
	public Book[] chaxun(String BookName) {
		Book [] book=new Book[1];
		init();
		String s;
		try{
			while((s=inpu.readLine())!=null){
				String ss[]=s.split(",");
				if(BookName.equals(ss[0])){
					book[0].setBookName(ss[0]);
					book[0].setAuthor(ss[1]);
					book[0].setPrice(Float.parseFloat(ss[2]));
					book[0].setPress(ss[3]);
					break;
		}
			inpu.close();
			input.close();
		}
		}
			catch(IOException e){
				e.printStackTrace();
			}
		return book;
		}

	public void AddBook(String bookName, String author, double price, String press) {
		int num=getNumOfBooks();
		try{
			BufferedWriter outpu=new BufferedWriter(new FileWriter("D://javacopytest//wendang.txt",true));
			outpu.write(bookName);
			outpu.write(","+author+",");
			outpu.wait((long)price);
			outpu.write(","+press);
			outpu.newLine();//插入一个回车
			outpu.close();
		}
		catch(Exception e){}
		
	}
}
	