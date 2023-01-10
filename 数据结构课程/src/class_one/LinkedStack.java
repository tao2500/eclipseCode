package class_one;

public class LinkedStack<T> {  //Á´Õ»
	private SinglyList<T> list;
	public LinkedStack(){
		this.list = new SinglyList<T>();
	}
	public boolean isEmpty(){
		return this.list.isEmpty();
	}
	public void push(T x){
		this.list.insert(0,x);
	}
	public T peek(){
		return this.list.get(0);
	}
	public T pop(){
		return this.list.remove(0);
	}
	public String toString(){
		String str=this.getClass().getName()+"(";
		while(this.list.head.next!=null){
			str+=this.list.head.next.data;
			this.list.head.next=this.list.head.next.next;
		}
		return str;
	}
}
