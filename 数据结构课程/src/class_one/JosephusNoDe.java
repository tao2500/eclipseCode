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
			//System.out.println("���гɹ�");
			old=nee;
		}
		old.next=head;
		System.out.println(head.toString());
		while(n>1) {
			start=(start+distance-1)%n;
			//System.out.println("��ʱɾ��"+start+"��ʱn="+n);
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
				System.out.println("ɾ��"+s+","+head.toString());
				n--;
			}
			else{
				System.out.println("ɾ��"+head.remove(start)+","+head.toString());
				n--;
			}
			
		}
		System.out.println("��������"+head.data);
		}
	
	JosephusNoDe(int n){
		NoDe<String> old=new NoDe<String>(" 1 "+"",null);
		NoDe<String> head=old;
		for(int i=1;i<n;i++){
			int in=i+1;
			NoDe<String> nee=new NoDe<String>(in+" ",null);
			old.next=nee;
			//System.out.println("���гɹ�");
			old=nee;
		}
		old.next=head;
		System.out.println();
		System.out.println();
		System.out.println("�´�����һ������Ϊ");
		System.out.println(head.toString());
		System.out.println("�������size="+head.size());
		System.out.println("�жϸ������Ƿ�Ϊ��");
		System.out.println(head.isEmpty());
		System.out.println("ɾ��3");
		head.remove(2);
		System.out.println("ɾ���������Ϊ");
		System.out.println(head.toString());
		System.out.println("�������в���3");
		NoDe<String> input=new NoDe<String>("3 "+"",null);
		head.insert(input, 2);
		System.out.println("�����������Ϊ");
		System.out.println(head.toString());
		System.out.println("�޸�2Ϊ3");
		head.modify("3 ", 1);
		System.out.println("�޸ĺ������Ϊ");
		System.out.println(head.toString());
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JosephusNoDe(10,0,3);
		new JosephusNoDe(7);
		
	}

}
