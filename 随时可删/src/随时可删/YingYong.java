package ��ʱ��ɾ;

public class YingYong{
	
	static String a[] =new String[1];
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		
		a[0]="0";
		a=updata(5,"5");
		System.out.println("���������е�Ԫ��Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static String[] updata(int x,String s){
		String b[] = new String[x];
		int youxiaozhi = 0;
		for(int t=0;t<a.length;t++){
			if(a[t]!=null) youxiaozhi+=1;
			System.out.println("ok");
		}
		if(a.length<x){
			
			int i=0;
			for(i=0;i<a.length;i++){
				b[i]=a[i];
			}
			b[youxiaozhi]=s;
			
		}
		return b;
	}

}
