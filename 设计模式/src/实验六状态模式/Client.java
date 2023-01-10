package 实验六状态模式;

public class Client {
	public static void main(String [] args){
		Context c = new Context();
		c.now();
		
		c.cool(100);
		c.now();
		
		c.heat(200);
		c.now();
	}
}
