package sQL_DBUtil;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	BookService book=new BookService();
	book.ShowData();
	System.out.println("���б����������");
	book.AddData();
	book.ShowData();
	System.out.println("��Ӻ�����������");
	book.UpData();
	book.ShowData();
	System.out.println("�޸ĺ�����������");
	book.DelateData();
	book.ShowData();
	System.out.println("���б����������");
	}
}
