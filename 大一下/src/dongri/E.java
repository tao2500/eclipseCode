package dongri;

public class E {

	public static void main (String args[]){
		int[]c={10,9,-2,8};
		
		int index1=java.util.Arrays.binarySearch(c, 19);
		int index2=java.util.Arrays.binarySearch(c, -2);
		System.out.printf("%b:%b",index1<0,index2>=0);
		System.gc();//进行垃圾收集操作
	}
	
}
