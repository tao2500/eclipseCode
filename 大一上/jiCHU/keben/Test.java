package keben;

public class Test {
	public static void main(String[]args){
		Cylinder e=new Cylinder();
		double a=3.14159265,b=10.258;
		e.setR(a);
		e.setH(b);
		System.out.println("Բ��������Ϊ��"+e.getVolume());
	}
}
