package ʵ�������ģʽ;

public class Context {
	private Strategy s;
	
	public void setStrategy(Strategy s){
		this.s=s;
	}
	
	public void star(){
		s.star();
	}
}
