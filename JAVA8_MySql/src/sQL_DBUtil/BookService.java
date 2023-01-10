package sQL_DBUtil;

public class BookService {
	DBUtil dbu=new DBUtil();
	public void AddData(){
		String s="insert into book (name,author,publisher,price,imformation) values ('java8高级应用与开发','QST','清华大学出版社',59.50,'暂无');";
		dbu.UpDataSql(s);
		System.out.println("数据已添加");
	}
	public void UpData(){
		String s="update book set name = 'test', price = 8888 where name = 'java8高级应用与开发'";
		dbu.UpDataSql(s);
		System.out.println("数据已修改");
	}
	public void ShowData(){
		String s="SELECT * FROM BOOK";
		dbu.ShowData(s);
	}
	public void DelateData(){
		String s="delete from book where name='test'";
		dbu.UpDataSql(s);
		System.out.println("数据已删除");
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}

}
