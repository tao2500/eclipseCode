package fanxing_Jihe_Kuangjia;

public class Test {
	public static void main (String [] args){
		BookService book=new BookService();
		System.out.println("��������е��鼮��Ϣ���£�");
		book.print();
		Book b=book.searchByPrice();
		System.out.println();
		System.out.println("���������鼮Ϊ   "+b.getBookname());
	}
}
