package osTwo;

public class Producer implements Runnable{    
	   private Bucket bucket;    
	   public Producer(Bucket bucket){    
	      this.bucket=bucket;    
	   }    
	   @Override    
	   public void run() {    
	      for (int i = 0; i < 10; i++) {    //来回十次交易    
	         bucket.put((int)(Math.random()*1000));    
	      }    
	   }    
}    
