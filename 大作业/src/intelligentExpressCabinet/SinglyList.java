package intelligentExpressCabinet;

public class SinglyList<T> {
	public NoDe<T> head;
	public SinglyList(){
		Read ra = new Read();
		this.head = ra.Read().next;//��ͷ����ȡͷָ��
		
	}
	public boolean isEmpty(){
		return this.head.next==null; 
	}
	public NoDe get(int i){
		NoDe<T> p = this.head.next;
		for(int j=0;p!=null&&j<i;j++){
			p=p.next;
		}
		return (i>=0&&p!=null) ? p : null;
	}
	public void set(int i,T x){
		
	}
	public int size(){
		int in=0;
		NoDe<T> old=this.head;
		for(;old.getPickupcode()!=null;old=old.next){
			in+=1;
		}
		return in;
	}
	public String toString(){
		NoDe<T> old=head;
		String str=this.getClass().getName()+"(";//��������
		for(NoDe<T> p=this.head.next;p!=null;p=p.next){//P����������
			str=str+old.getName()+"  "+old.getTelephone()+"  "+old.getEntrytime()+"  "+old.getPickupcode()+"  "+old.getSize()+(p.next!=null?",":"");
		}
		return str+")";
	}
	public NoDe<T> insert(int i,T[] x){ //���룬���ز���ڵ�
		if(x==null) return null;
		NoDe<T> front=this.head;
		for(int j=0;front.next!=null &&j<i;j++){//�ҵ�����ǰһ���ڵ�
			front =front.next;
		}
		front.next=new NoDe<T>(x,front.next);
		return front.next;
	}
	public NoDe<T> insert(T[] x){ //β��
		return insert(Integer.MAX_VALUE,x);
	}
	public NoDe remove(int i){
		NoDe<T> front=this.head;
		for(int j=0;front.next!=null && j<i;j++){
			front = front.next;
		}
		if(i>=0 && front.next!=null){
			NoDe x = front.next;
			front.next=front.next.next;
			return x;
		}
		return null;
	}
	public void clear(){
		this.head.next=null;
	}
	public NoDe<T> searchtelephone(T key){
		NoDe<T> front=this.head;
		NoDe<T> target=null;
		while(front.next!=null){
			if(front.next.getTelephone()==key){
				target=front.next;
			}
			front = front.next;
		}
		return target;
	}
	public Boolean removeOnPickupcode(T key){
		NoDe<T> front=this.head;
		NoDe<T> target=null;
		while(front.next!=null){
			if(front.next.getPickupcode()==key){
				target=front.next;
				front.next=front.next.next;
				target.next=null;
				return true;
			}
			front = front.next;
		}
		return false;
	}
}
