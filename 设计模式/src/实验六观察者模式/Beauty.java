package 实验六观察者模式;

public class Beauty extends Subject{
	@Override
	public void say(String message) {
		// TODO 自动生成的方法存根
		for(Object o : al){
			((Hunter) o).read(message);
		}
	}

}
