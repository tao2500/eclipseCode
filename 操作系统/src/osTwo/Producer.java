package osTwo;

public class Producer implements Runnable{    
	   private Bucket bucket;    
	   public Producer(Bucket bucket){    
	      this.bucket=bucket;    
	   }    
	   @Override    
	   public void run() {    
	      for (int i = 0; i < 10; i++) {    //����ʮ�ν���    
	         bucket.put((int)(Math.random()*1000));    
	      }    
	   }    
}    
