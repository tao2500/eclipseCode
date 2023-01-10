package keben;
import java.util.Scanner;
public class I {
    public static void main (String[]args) {
     Scanner s=new Scanner(System.in);
     System.out.println("请输入一个数");
     int a= s.nextInt();
     int b,sum=0;
     for(b=1;b<a;b++){
    		 if(a%b==0){
    			sum+=b;
    			//System.out.println("因子的值为"+b);
    		 }
     }
             if (sum==a){
            	 System.out.println(a+"是完数");
             }
             else{
            	 System.out.println(a+"不是完数");
             }
    }
}