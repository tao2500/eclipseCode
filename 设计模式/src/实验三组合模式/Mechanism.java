package 实验三组合模式;

public abstract class Mechanism {
	public abstract void add(Mechanism m);
	public abstract void remove(Mechanism m);
	public abstract Mechanism getchlid(int i);
	public abstract void work();
}
