package class_one;

public class SeqStack<T> {   //顺序栈
	private SeqList<T> list;
	public SeqStack(int length){
		this.list = new SeqList<T>(length);
	}
	public SeqStack(){
		this(64);
	}
	public boolean isEmpty(){
		return this.list.isEmpty();
	}
	public void push(T x){
		this.list.insert(x);
	}
	public T peek(){
		return this.list.get(list.size()-1);
	}
	public T pop(){
		return list.remove(list.size()-1);
	}
	public String toString(){
		String s="顺序栈中所有的元素如下";
		for(int i=0;i<this.list.size();i++) {
			s=s+list.get(i)+",";
		}
		return s;
	}
	public String toPreviousString(){
		String s="顺序栈中所有的元素如下（反向输出）";
		for(int i=this.list.size()-1;i>=0;i--) {
			s=s+list.get(i)+",";
		}
		return s;
	}
}
