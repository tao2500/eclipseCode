package 实验二外观模式;

public class Facade {
	BlackboardLight b = new BlackboardLight();
	Computer c = new Computer();
	Curtain cu = new Curtain();
	Microphone m = new Microphone();
	Projector p = new Projector();
	
	public void open(){
		b.open();
		c.open();
		cu.open();
		m.open();
		p.open();
	}
	public void off(){
		b.off();
		c.off();
		cu.off();
		m.off();
		p.off();
	}
}

