package lianXi;

public class Son extends Father{
	void haveBreakfast(String A,String B){
		super.haveBreakfast("包子","馒头");
		System.out.println("儿子吃"+A+"吃"+B);
	}
		
}
