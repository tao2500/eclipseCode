package lianlianshou;

class test implements Runnable  {
	public void run(){
		System.out.print("ok");
	}
	
	public static void main (String [] args){
		test a=new test();
		Thread thread=new Thread (a) ;
		thread.start();
	}
}
