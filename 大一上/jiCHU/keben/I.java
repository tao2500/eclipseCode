package keben;
import java.util.Scanner;
public class I {
    public static void main (String[]args) {
     Scanner s=new Scanner(System.in);
     System.out.println("������һ����");
     int a= s.nextInt();
     int b,sum=0;
     for(b=1;b<a;b++){
    		 if(a%b==0){
    			sum+=b;
    			//System.out.println("���ӵ�ֵΪ"+b);
    		 }
     }
             if (sum==a){
            	 System.out.println(a+"������");
             }
             else{
            	 System.out.println(a+"��������");
             }
    }
}