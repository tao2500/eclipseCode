package keben;

public class C {
	public static void main (String args [ ]) {
		int startPosition=0,endPosition=0;
		 char cStart='��',cEnd='��';
		 
	  int startPosition1=cStart;
	   int endPosition1=cEnd;

	   System.out.println("ϣ����ĸ\'a\'��unicode���е�˳��λ��:" +startPosition1);
	   System.out.println("ϣ����ĸ��:");
	    for(int i=startPosition1;i<=endPosition1;i++){
	    char c='\0';
	    
	    c = (char)i;
	    
	    System.out.print(" "+c);
	    if((i-startPosition1+1)%10==0)
	    	System.out.println("");
	    }
	}
}
