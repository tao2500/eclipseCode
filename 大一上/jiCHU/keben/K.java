package keben;
import java.util.Random;
public class K {
	public static void main(String [] args){
		Random a=new Random();
		int[]c=new int[100];
		int d;
		double h=0.00,i;
		for(d=0;d<100;d++){
			int z=a.nextInt(100);
			c[d]=z;
			h+=c[d];
		}
		i=h/100;
		int e=c[0],g=c[0],f;
		for(f=0;f<100;f++){
			if(e<c[f]){
				e=c[f];
		}
			if(g>c[f]){
				g=c[f];
			}
		}
		System.out.println("最大值为"+e);
		System.out.println("最小值为"+g);	
		System.out.println("平均值为"+i);
	}

}
