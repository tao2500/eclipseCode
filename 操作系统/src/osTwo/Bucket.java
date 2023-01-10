package osTwo;

public class Bucket{    
	   private int packOdBalls;    
	   private boolean available=false;    //默认篮子里没有球
	      
	   public synchronized int get()  {  //消费者从篮子里面取出球    
	      if(available==false){       //如果没有就等着    
	         try {    
	            System.out.println("消费者：暂时没有球可以消费我就等着...");    
	            wait();
	         } catch (InterruptedException e) {    
	            // TODO自动生成的 catch 块    
	            e.printStackTrace();    
	         }    
	      }                        //有的话就取出来    
	      System.out.println("消费者获得了"+packOdBalls+"个球");    
	      available=false;    
	      notify();    
	      return packOdBalls;    
	   }    
	     
	   public synchronized void put(int packOdBalls)  {  //生产者将生产球并放入到篮子里面    
	      if (available) {    
	         try {    
	            System.out.println("生产者：既然篮子里面已经有球了我就消费完了再生产吧！");    
	            wait();    
	         } catch (InterruptedException e) {    
	            // TODO自动生成的 catch 块    
	            e.printStackTrace();    
	         }    
	      }    
	      this.packOdBalls=packOdBalls;    
	      available=true;    
	      System.out.println("生产者放进去了"+packOdBalls+"个球");    
	      notify();    
	   }    
	      
}
