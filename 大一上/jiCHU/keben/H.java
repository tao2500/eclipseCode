package keben;  //上机实践3
import java.util.Scanner;
public class H {
    public static void main (String[]args) {
        int number=0,d5,d4,d3,d2,d1; 
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入一个1~99999之间的数");
        number=reader.nextInt();
        if(number<100000&&number>=0) {
              d5 = number/10000;
              d4 = number/1000%10;
              d3 = number/100%100%10;
              d2 = number/10%1000%100%10;
              d1 = number%10;
              if(number>=10000) {
                  System.out.println(number+"是五位数");
                  if(d1==d5&&d2==d4) {
                    System.out.println(number+"是回文数");
                  }
                   else {System.out.println(number+"不是回文数");
                   }
              }
                       else if(number>=1000) {
                           System.out.println(number+"是四位数");
                           if(d1==d4&&d2==d3) {
                               System.out.println(number+"是回文数");
                            }
                           else {System.out.println(number+"不是回文数");
                            }
                                    }
                       else if(number>=100) {
                           System.out.println(number+"是三位数");
                           if(d1==d3) {
                             System.out.println(number+"是回文数");
                             }
                           else {System.out.println(number+"不是回文数");
                          }
                                          }
                       else if(number>=10) {
                           System.out.println(number+"是2位数");
                            if(d1==d2) {
                             System.out.println(number+"是回文数");
                            }
                            else {System.out.println(number+"不是回文数");
                                     }
                          }
                       else if(d1!=0) {
                           System.out.println(number+"是1位数");
                           System.out.println(number+"是回文数");
                          }
            }
                          else {
                              System.out.printf("\n%d不在1至99999之间",number);
                          }
        }
    }

    

    
  