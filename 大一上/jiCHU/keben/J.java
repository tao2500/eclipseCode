package keben;

public class J {
	public static void main (String[]args){
		int i,j,sum;
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				sum=i*j;
				System.out.print(i+"*"+j+"= "  +sum+"  ");
				if(j==9){
					System.out.println();
				}
			}
		}
	}

}
