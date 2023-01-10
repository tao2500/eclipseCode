package 实验六状态模式;

public class Context {
	private Statc s = new Liquid();
	private int temperature = 20;
	public void changeStatc(){
		if(temperature<0){
			s = new Solid(temperature);
		}else if(temperature>=0&&temperature<=100){
			s = new Liquid(temperature);
		}else{
			s = new Gas(temperature);
		}
	}
	public void heat(int x){
		temperature+=x;
		changeStatc();
	}
	public void cool(int x){
		temperature-=x;
		changeStatc();
	}
	public void now(){
		s.now();
	}
} 
