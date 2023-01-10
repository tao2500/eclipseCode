package class_one;

public class 循环金字塔 {
//	public static void structure(int i){ //i表示要打印的行数
//		if(i>0){
//			if(i==1){
//				System.out.println(i);
//			}else{
//				i-=1;
//				structure(i);
//				System.out.print(i);
//			}
//			
//			
//		}
//	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		pyramid(3);   
	}
	public static void pyramid(int n){  //   n行
		int i;
		int num;
		for(i=1;i<n+1;i++){ 
			num=i;
			for(int j=0;j<n-i;j++)
				System.out.print(" ");  //左边填充空格
			if(num>1){         // 第二行开始 此时i=2
				for(int m=0;m<i;m++)
					num--;    //num 从2减到0
				for( int m=0;m<i;m++){
					num++;     //一步步从0 加到2 
					System.out.print(num);  //执行I次  输出12
				}     //此时num=2
				for(int m=0;m<i-1;m++){ 
					--num;     //反向输出减小
					System.out.print(num);
				}
			}
		else
			System.out.print(num);
		System.out.println();
		}
		}
	

}
