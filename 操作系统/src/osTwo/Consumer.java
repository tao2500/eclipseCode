package osTwo;

public class Consumer implements Runnable{    
	   private Bucket bucket;    
	   public Consumer(Bucket bucket){    
	      this.bucket=bucket;    
	   }    
	   @Override    
	   public void run() {    
	      for (int i = 0; i < 10; i++) {    
	         bucket.get(); // 从篮子里拿10次球   
	      }    
	   }    
	      
	}    
