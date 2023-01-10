package class_one;

import java.util.List;

public class Josephus {
	int a,b,c;
	Object [] list;
	Josephus(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		if(a<=0||b<0||b>=a||c<=0||c>=a){
			throw new IllegalArgumentException("n="+a+"staar="+b+"distance"+c);
		}
		System.out.println("Josephus("+a+","+b+","+c+"),");
		list = new Object[a];
		for(int i=0;i<a;i++){
			list[i]="A"+(i+1);
		}
		while(a>1){
			b=(b+c-1)%a;
			String dele=list[b].toString();
			for(int t=b;t<list.length-1;t++){
				list[t]=list[t+1];
			}
			--a;
			list[a-1]=null;
			System.out.println("删除"+dele+","+this.toStr(list));
		}
		System.out.println("被赦免者为"+list[0]);
	}
	public String toStr(Object [] a){
		String str = this.getClass().getName()+"(";
		if(this.a>0){
			str += a[0].toString();
		}
		for(int i=1;i<this.a;i++){
			str += ","+a[i].toString();
		}
		return str+")";
			
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Josephus(5,0,2);
	}

}
