package fanxing_Jihe_Kuangjia;

public class Test {
	public static void main (String [] args){
		BookService book=new BookService();
		System.out.println("书库中所有的书籍信息如下：");
		book.print();
		Book b=book.searchByPrice();
		System.out.println();
		System.out.println("其中最贵的书籍为   "+b.getBookname());
	}
}
