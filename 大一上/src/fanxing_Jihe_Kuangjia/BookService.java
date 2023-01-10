package fanxing_Jihe_Kuangjia;
import java.util.*;
import java.lang.*;
public class BookService {
	LinkedList<Book> lk= new LinkedList<Book>();//定义链表,存储数据
	BookService(){
		Book ba=new Book();
		ba.setBookname("Java实用教程");
		ba.setPrice("59.50");
		ba.setPubli("清华大学出版社");
		ba.setIsbm("ISBN 978-7-302-46425-9");
		lk.add(ba);
		Book bb=new Book();
		bb.setBookname("Java核心技术卷");
		bb.setPrice("258.00");
		bb.setPubli("凯 s.霍斯特曼");
		bb.setIsbm("ISBN 978-7-111-23950-5");
		lk.add(bb);
		Book bc=new Book();
		bc.setBookname("网络设计与制作");
		bc.setPrice("29.50");
		bc.setPubli("清华大学·出版社");
		bc.setIsbm("ISBN 978-7-302-21541-7");
		lk.add(bc);
	}
	BookService(Book b){
		lk.add(b);
	}
	public void print(){
		Iterator<Book> iterator=lk.iterator();
		while(iterator.hasNext()){
			Book b=iterator.next();
			System.out.println(b.toString());
		}
	}
	public Book searchByPrice(){
		Iterator<Book> iterator=lk.iterator();
		double rice[]=new double[lk.size()];
		for(int i=0,ii=0;i<lk.size();i++,ii++){
			Book b=iterator.next();
			Scanner sc=new Scanner(b.toString());
			Scanner s=sc.useDelimiter("\\D{2,}");
			rice[ii]=s.nextDouble();//按顺序存储全部书籍的价格
			String ss=s.next();//ss中存储的为isbn
			//System.out.println(ss);
		}
		int max=0;//最贵的书的数组中编号
		for(int i=1;i<rice.length;i++){
			if(rice[i-1]<rice[i]){
				max=i;
			}
		}
		//System.out.println(max+" 最贵的书测试 "+rice[max]);
		return lk.get(max);
	}

}
