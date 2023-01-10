package class_one;

public class SeqStack<T> {   //˳��ջ
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
		String s="˳��ջ�����е�Ԫ������";
		for(int i=0;i<this.list.size();i++) {
			s=s+list.get(i)+",";
		}
		return s;
	}
	public String toPreviousString(){
		String s="˳��ջ�����е�Ԫ�����£����������";
		for(int i=this.list.size()-1;i>=0;i--) {
			s=s+list.get(i)+",";
		}
		return s;
	}
}
