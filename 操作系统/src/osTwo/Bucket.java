package osTwo;

public class Bucket{    
	   private int packOdBalls;    
	   private boolean available=false;    //Ĭ��������û����
	      
	   public synchronized int get()  {  //�����ߴ���������ȡ����    
	      if(available==false){       //���û�о͵���    
	         try {    
	            System.out.println("�����ߣ���ʱû������������Ҿ͵���...");    
	            wait();
	         } catch (InterruptedException e) {    
	            // TODO�Զ����ɵ� catch ��    
	            e.printStackTrace();    
	         }    
	      }                        //�еĻ���ȡ����    
	      System.out.println("�����߻����"+packOdBalls+"����");    
	      available=false;    
	      notify();    
	      return packOdBalls;    
	   }    
	     
	   public synchronized void put(int packOdBalls)  {  //�����߽������򲢷��뵽��������    
	      if (available) {    
	         try {    
	            System.out.println("�����ߣ���Ȼ���������Ѿ��������Ҿ����������������ɣ�");    
	            wait();    
	         } catch (InterruptedException e) {    
	            // TODO�Զ����ɵ� catch ��    
	            e.printStackTrace();    
	         }    
	      }    
	      this.packOdBalls=packOdBalls;    
	      available=true;    
	      System.out.println("�����߷Ž�ȥ��"+packOdBalls+"����");    
	      notify();    
	   }    
	      
}
