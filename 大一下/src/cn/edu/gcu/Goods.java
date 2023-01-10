package cn.edu.gcu;

public class Goods {
	private String mane;
	private int number;
	private int unitprice;
	
	public Goods(String mane,int unitprice){
		this(mane,0,unitprice);		
	}
	public Goods(String mane,int number,int unitprice){
		this.mane=mane;
		this.number=number;
		this.unitprice=unitprice;
	}
	
	public String getMane(){
		return this.mane;
	}
	public int getNumber(){
		return this.number;
	}
	public int getUnitprice(){
		return this.unitprice;
	}
	public void setMane(String a){
		this.mane=a;
	}
	public void setNumber(int a){
		this.number=a;
	}
	public void setUnitprice(int a){
		this.unitprice=a;
	}
	
	void buy(int number1) {
		number=number+number1;
	}
	void sale(int number2){
		if(number>number2){
			number=number-number2;
		}
	}
	void print(){
		System.out.println("商品名称"+mane+"  "+"商品数量"+number+"  "+"商品单价"+unitprice);
	}
}
