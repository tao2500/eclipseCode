package class_one;

public class �ݹ������ {
	public static void count(int n, int a,int plies) {
		if(n==1) {
			for(int i=1;i<plies-a+1;i++) {
				System.out.print("  ");
			}
		}
		System.out.print(" "+n);
		if(n<a) {
			count(n+1,a,plies);
			System.out.print(" "+n);
		}
	}
	
	public static void print(int a){   //��������������ӡ
		for(int i=1;i<a+1;i++) {
			count(1,i,a);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print(9);
	}
}
