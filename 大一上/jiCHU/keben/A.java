package keben;

public class A {
	public static void main (String [] args) {
		int x=5,y=6,z;
		z = ++x + y++;  //12  y=7
		x = ++x + x++;  //14  
		z = ++x + x++;  //30  x=16  
		System.out.print("x="+x+",y="+y+",z="+z);	
	}
}	
