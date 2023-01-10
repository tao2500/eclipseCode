package fanxing_Jihe_Kuangjia;

public class Book implements Comparable{
	String bookname;
	String price;
	String publi;
	String isbm;
	
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPubli() {
		return publi;
	}

	public void setPubli(String publi) {
		this.publi = publi;
	}

	public String getIsbm() {
		return isbm;
	}

	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}

	public String toString(){
		return bookname+price+publi+isbm;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO 自动生成的方法存根
		return 0;
	}


}
