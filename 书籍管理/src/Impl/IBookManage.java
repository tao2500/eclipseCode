package Impl;
import Beans.Book;
public interface IBookManage {
	public Book[] getAllBook();
	public Book[] chaxun(String BookName);
	public void AddBook (String bookName,String author,double price,String press);
}
