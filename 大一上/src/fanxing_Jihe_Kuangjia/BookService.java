package fanxing_Jihe_Kuangjia;
import java.util.*;
import java.lang.*;
public class BookService {
	LinkedList<Book> lk= new LinkedList<Book>();//��������,�洢����
	BookService(){
		Book ba=new Book();
		ba.setBookname("Javaʵ�ý̳�");
		ba.setPrice("59.50");
		ba.setPubli("�廪��ѧ������");
		ba.setIsbm("ISBN 978-7-302-46425-9");
		lk.add(ba);
		Book bb=new Book();
		bb.setBookname("Java���ļ�����");
		bb.setPrice("258.00");
		bb.setPubli("�� s.��˹����");
		bb.setIsbm("ISBN 978-7-111-23950-5");
		lk.add(bb);
		Book bc=new Book();
		bc.setBookname("�������������");
		bc.setPrice("29.50");
		bc.setPubli("�廪��ѧ��������");
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
			rice[ii]=s.nextDouble();//��˳��洢ȫ���鼮�ļ۸�
			String ss=s.next();//ss�д洢��Ϊisbn
			//System.out.println(ss);
		}
		int max=0;//������������б��
		for(int i=1;i<rice.length;i++){
			if(rice[i-1]<rice[i]){
				max=i;
			}
		}
		//System.out.println(max+" ��������� "+rice[max]);
		return lk.get(max);
	}

}
