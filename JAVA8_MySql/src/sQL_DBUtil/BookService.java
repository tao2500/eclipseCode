package sQL_DBUtil;

public class BookService {
	DBUtil dbu=new DBUtil();
	public void AddData(){
		String s="insert into book (name,author,publisher,price,imformation) values ('java8�߼�Ӧ���뿪��','QST','�廪��ѧ������',59.50,'����');";
		dbu.UpDataSql(s);
		System.out.println("���������");
	}
	public void UpData(){
		String s="update book set name = 'test', price = 8888 where name = 'java8�߼�Ӧ���뿪��'";
		dbu.UpDataSql(s);
		System.out.println("�������޸�");
	}
	public void ShowData(){
		String s="SELECT * FROM BOOK";
		dbu.ShowData(s);
	}
	public void DelateData(){
		String s="delete from book where name='test'";
		dbu.UpDataSql(s);
		System.out.println("������ɾ��");
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}

}
