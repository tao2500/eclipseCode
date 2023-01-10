package class_one;

public class Pyramid {
	public static void structure(int i,int count){ //i表示要打印的行数 count计算打印空格数
		int in = i;
		if(in>0){
			if(in==1){
				System.out.print(in);
			}else{
				for(int ii = in-1; ii>0;ii-- ) System.out.print(" ");//打印空格
				System.out.println("test");
				in = in-1;
				structure(in,0);
				System.out.print(in);
			}
			
			
		}
		else{
			System.out.println("层数有误！");
		}
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		structure(3,0);
	}

}
