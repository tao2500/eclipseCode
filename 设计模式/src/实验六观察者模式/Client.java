package 实验六观察者模式;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Subject s = new Beauty();
		Hunter a,b;
		a = new HunterOne();
		b = new HunterTwo();
		s.addHunter(a);
		s.addHunter(b);
		s.say("我今天有空");
	}

}
