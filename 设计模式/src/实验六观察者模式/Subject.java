package 实验六观察者模式;

import java.util.ArrayList;

public abstract class Subject {
	protected ArrayList al = new ArrayList();
	
	public void addHunter(Hunter o){
		al.add(o);
	}
	
	public void Fling(Hunter o){
		al.remove(o);
	}
	
	public abstract void say(String message);
}
