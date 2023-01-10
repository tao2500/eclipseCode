package class_one;

public class JosephusNoDe {
	
	JosephusNoDe(int n,int start,int distance){
		if(n<=0||start<0||start>=n||distance<=0||distance>=n) {
			throw new IllegalArgumentException("n="+n+",start="+start+",distance="+distance);
		}
		System.out.print("Josephus("+n+","+start+","+distance+")  ");
		NoDe<String> old=new NoDe<String>((char)('A')+"",null);
		NoDe<String> head=old;
		NoDe<String> copy=head;
		for(int i=1;i<n;i++){
			NoDe<String> nee=new NoDe<String>((char)('A'+i)+"",null);
			old.next=nee;
			//System.out.println("运行成功");
			old=nee;
		}
		old.next=head;
		System.out.println(head.toString());
		while(n>1) {
			start=(start+distance-1)%n;
			//System.out.println("此时删除"+start+"此时n="+n);
			if(start==0){
				String s=head.data;
				copy=head.next;
				//System.out.println("heade.size="+head.size());
				for(int i=1;i<head.size();i++){
					//System.out.println("s="+s+"//head.next.data="+head.next.data);
					head=head.next;
					if(s.equals(head.next.data)){
						//System.out.println("test");
						head.next.data=null;
						head.next=head.next.next;
					}
				}
				head=copy;
				System.out.println("删除"+s+","+head.toString());
				n--;
			}
			else{
				System.out.println("删除"+head.remove(start)+","+head.toString());
				n--;
			}
			
		}
		System.out.println("被赦免是"+head.data);
		}
	
	JosephusNoDe(int n){
		NoDe<String> old=new NoDe<String>(" 1 "+"",null);
		NoDe<String> head=old;
		for(int i=1;i<n;i++){
			int in=i+1;
			NoDe<String> nee=new NoDe<String>(in+" ",null);
			old.next=nee;
			//System.out.println("运行成功");
			old=nee;
		}
		old.next=head;
		System.out.println();
		System.out.println();
		System.out.println("新创建的一个链表为");
		System.out.println(head.toString());
		System.out.println("该链表的size="+head.size());
		System.out.println("判断该链表是否为空");
		System.out.println(head.isEmpty());
		System.out.println("删除3");
		head.remove(2);
		System.out.println("删除后的链表为");
		System.out.println(head.toString());
		System.out.println("在链表中插入3");
		NoDe<String> input=new NoDe<String>("3 "+"",null);
		head.insert(input, 2);
		System.out.println("插入后的链表变为");
		System.out.println(head.toString());
		System.out.println("修改2为3");
		head.modify("3 ", 1);
		System.out.println("修改后的链表为");
		System.out.println(head.toString());
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JosephusNoDe(10,0,3);
		new JosephusNoDe(7);
		
	}

}
