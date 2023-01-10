package class_one;

public class SeqQueue<T> implements Queue{             //P108顺序循环队列
	private Object element[];
	 int front,rear;  //定义头标与尾标
	private static final int MIN_CAPACITY = 4;
	public SeqQueue(int length){
		if(length<MIN_CAPACITY){
			length=MIN_CAPACITY;
		}
		this.element = new Object[length];
		this.front = this.rear = 0;
	}
	public SeqQueue(){
		this(MIN_CAPACITY);
	}
	public boolean isEmpty(){
		return this.front==this.rear;
	}
	public boolean add(Object x){
		if(x==null){
			return false;
		}
		if(this.front==(this.rear+1)%this.element.length){//队列满
			Object[] temp = this.element;
			this.element = new Object[temp.length*2];
			int j=0;
			for(int i = this.front;i!=this.rear;i=(i+1)%temp.length)
				this.element[j++] = temp[i];
			this.front = 0;
			this.rear =j;
		}
		this.element[this.rear] = x;
		this.rear = (this.rear+1) % this.element.length;
		return true;
	}
	public int size(){
		if(this.rear==0){
			return 5-this.front;
		}
		return this.rear-this.front;
	}
	public T peek(){
		return this.isEmpty() ? null : (T)this.element[this.front];
	}
	public T poll(){
		if(this.isEmpty())
			return null;
		T temp = (T)this.element[this.front];
		this.front = (this.front+1) % this.element.length;
		return temp;
	}
	public String toString(){
		String s=this.getClass().getName()+"(";//返回类名
		Object[] temp = this.element;
		for(int i = this.front;i!=this.rear;i=(i+1)%temp.length){
			s+=","+temp[i].toString();
		}
		s+="),";
		return s;
	}
}
