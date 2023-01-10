package class_one;

public class LinkedQueue<T> implements Queue {   //������
	private SinglyList<T> list;
	public NoDe<T> head;//ͷָ��
	private static final int MIN_CAPACITY = 4;
	public LinkedQueue(){
		this.head = new NoDe<T>();
	}
	public LinkedQueue(T[] values){
		this();//�����յ�����ֻ��ͷ���
		NoDe<T> rear = this.head; //βָ��ָ���������һ���ڵ�
		for(int i=0;i<values.length;i++){
			if(values[i]!=null){
				rear.next=new NoDe<T>(values[i],null);//β��
				rear = rear.next;
			}
		}
	}
	public boolean isEmpty(){
		return this.head.next==null;
	}
	public T get(int i){
		NoDe<T> p = this.head.next;
		for(int j=0;p!=null&&j<i;j++){
			p=p.next;
		}
		return (i>=0&&p!=null) ? p.data : null;
	}
	public void set(int i,T x){
		
	}
	public int size(){
		NoDe<T> front=this.head;
		int size=0;
		if(front.next!=null) size+=1;
		return size;
	}
	public String toString(){
		String str=this.getClass().getName()+"(";//��������
		for(NoDe<T> p=this.head.next;p!=null;p=p.next){//P����������
			str +=p.data.toString()+(p.next!=null?",":"");
		}
		return str+")";
	}
	public NoDe<T> insert(int i,Object x){ //���룬���ز���ڵ�
		if(x==null) return null;
		NoDe<T> front=this.head;
		for(int j=0;front.next!=null &&j<i;j++){//�ҵ�����ǰһ���ڵ�
			front =front.next;
		}
		front.next=new NoDe<T>((T)x,front.next);
		return front.next;
	}
	public boolean add(Object x){ //β��
		insert(Integer.MAX_VALUE,x);
		return true;
	}
	public T remove(int i){   //  ɾ����iλ
		NoDe<T> front=this.head;
		for(int j=0;front.next!=null && j<i;j++){
			front = front.next;
		}
		if(i>=0 && front.next!=null){
			T x=front.next.data;
			front.next=front.next.next;
			return x;
		}
		return null;
	}
	public T poll(){
		T t = head.data;
		head = head.next;
		return t;
	}
	public void clear(){
		this.head.next=null;
	}
	public NoDe<T> search(T key){
		NoDe<T> front=this.head;
		NoDe<T> target=null;
		while(front.next!=null){
			if(front.next.data==key){
				target=front.next;
			}
			front = front.next;
		}
		return target;
	}
	public T remove(T key){
		NoDe<T> front=this.head;
		NoDe<T> target=null;
		while(front.next!=null){
			if(front.next.data==key){
				target=front.next;
				front.next=front.next.next;
				target.next=null;
				return target.data;
			}
			front = front.next;
		}
		return null;
	}
	public Object peek() {
		// TODO �Զ����ɵķ������
		return head.data;
	}
}
