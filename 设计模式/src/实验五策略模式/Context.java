package 实验五策略模式;

public class Context {
	private Strategy s;
	
	public void setStrategy(Strategy s){
		this.s=s;
	}
	
	public void star(){
		s.star();
	}
}
