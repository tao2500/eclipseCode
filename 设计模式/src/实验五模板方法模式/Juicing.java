package 实验五模板方法模式;

public abstract class Juicing {
	
	public void cut(){
		System.out.println("正在把水果切片");
	}
	public void push(){
		System.out.println("正在把切好的水果放入榨汁机");
	}
	public abstract void addFruit();
	public void Star(){
		System.out.println("榨汁机开始工作");
	}
	public void handle(){
		cut();
		push();
		addFruit();
		Star();
	}
	
}
