package class_one;

public interface Queue<T> {
	public abstract boolean isEmpty();
	public abstract boolean add(T x);
	public abstract T peek();
	public abstract T poll();
	public abstract int size();
}
