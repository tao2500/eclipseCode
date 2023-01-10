package class_one;

public class NoDe<T> {
	public T data;
	public NoDe<T> next;
	NoDe<T> oid=null;
	public NoDe(T data,NoDe<T> next){
		this.data=data;
		this.next=next;
	}
	public NoDe(){
		this(null, null);
	}
	public String toString() {
		//System.out.println("此时链表的长度为："+this.size());
		NoDe<T> oid=this;
		NoDe<T> star=this;
		String str=this.getClass().getName()+"(";
		if(oid.data!=null)
			str+=oid.data;
		for(int i=1;i<star.size();i++){
			//System.out.println("此时oid的长度为："+start.size());
			str+=","+oid.next.data;
			oid=oid.next;
			if(oid.next==null){
				oid=star;
			}
		}	
		return str+")";
	}
	public boolean isEmpty() {
		return this.data==null;
	}
	public int size() {
		int in=1;
		NoDe<T> oid=this;
		NoDe<T> head=this;
		for(;!(oid.next.data).equals(head.data);oid=oid.next){
			in+=1;
		}
		return in;
	}
	public NoDe<T> get(int i) {
		//System.out.print("此时传入的i="+i);
		NoDe<T> data=oid;
		//System.out.print("此时传入的链表大小为="+oid.size());
//		if(i==0){
//			data= oid.next.next.next.next;
//			oid=data;
//			//System.out.print("此时传入的i=0时传出data为"+data.data+"data的下一个为："+data.next.data);
//			return data;
//		}
		if(i>0&&i<=oid.size())
			for(int ii=0;ii<i-1;ii++){
				data=oid.next;
				oid=data;
			}
		//System.out.print("此时输出的data="+data.data);
			return data;
	}
	public String ergodic(){   //遍历
		NoDe<T> data=this;
		String text="";
		if(data.data!=null){
			text +=data.data;
			data=data.next;
		}
		return text;
	}
	public int insert(NoDe<T> node,int i){
		NoDe<T>  before=this.get(i-1);//插入节点前一个节点
		if(i<this.size()&&i>0){
			before=this.get(i-2);
		}
		node.next=before.next;
		before.next=node;
		return i;
	}
	public T remove(int i){
//		if(i==0){
//			data=this.data;
//			System.out.println("此时第一个为"+data);
//
//			oid=this;
//			oid=this.next;
//			System.out.println("改变后第一个为"+oid.data);
//			return data;
//				}
		oid=this;
		NoDe<T>  before=oid.get(i);//获取删除前一个元素
		//System.out.print("获取到的前一个元素为"+before.data);
		oid=before;
		T data=before.next.data;
		//System.out.println("此时删除节点的前后节点为"+before.data+" ,"+before.next.next.data);
		before.next.data=null;
		before.next=before.next.next;
		return data;
	}
	public T modify(T data,int i){
		this.get(i).data=data;
		return data;
	}
}
