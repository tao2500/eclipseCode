package sQL_DBUtil;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	BookService book=new BookService();
	book.ShowData();
	System.out.println("现有表的数据如上");
	book.AddData();
	book.ShowData();
	System.out.println("添加后表的数据如上");
	book.UpData();
	book.ShowData();
	System.out.println("修改后表的数据如上");
	book.DelateData();
	book.ShowData();
	System.out.println("现有表的数据如上");
	}
}
