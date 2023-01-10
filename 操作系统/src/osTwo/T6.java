package osTwo;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bucket bucket=new Bucket(); //¹¹ÔìÀº×Ó    
	    new Thread(new Producer(bucket)).start();    
	    new Thread(new Consumer(bucket)).start();
	}

}
