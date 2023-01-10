package keben;

public class C {
	public static void main (String args [ ]) {
		int startPosition=0,endPosition=0;
		 char cStart='α',cEnd='ω';
		 
	  int startPosition1=cStart;
	   int endPosition1=cEnd;

	   System.out.println("希腊字母\'a\'在unicode表中的顺序位置:" +startPosition1);
	   System.out.println("希腊字母表:");
	    for(int i=startPosition1;i<=endPosition1;i++){
	    char c='\0';
	    
	    c = (char)i;
	    
	    System.out.print(" "+c);
	    if((i-startPosition1+1)%10==0)
	    	System.out.println("");
	    }
	}
}
