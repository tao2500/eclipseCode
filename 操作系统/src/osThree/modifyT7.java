package osThree;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
public class modifyT7 {
	public static void main(String[] args) {
		Shop shop = new Shop();
	    Producer pro = new Producer(shop);
	    Cousumer cou = new Cousumer(shop);
	    new Thread(pro).start();
	    new Thread(cou).start();
	}
}

class Product {
}

class Shop {
	Semaphore t = new Semaphore(10); //�ɹ������������Ϊ10
	private static List<Product> list = new ArrayList<Product>();
	public synchronized  void  produ() {
		Product product = new Product(); //�����²�Ʒ
	    list.add(product);
		System.out.println("producing"  );//����
		System.out.println("amount of product is " + list.size()); //��Ʒ����
		t.release();//V 
    }
    
	public synchronized void cousu() {
		try {
      	  t.acquire();//P 
        	} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
        		e.printStackTrace();
        	}
		if(list.size() != 0)
			list.remove(0);
        System.out.println("comsuming" );//����
        System.out.println("amount of product is " + list.size());
	}
}

class Cousumer implements Runnable {
	private Shop shop;
	public Cousumer(Shop shop){
		this.shop = shop;
    }
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				shop.cousu();
			}
			catch(Exception e)
			{e.printStackTrace();}
        }
    }
}

class Producer implements Runnable {
	private Shop shop;
	public Producer(Shop shop) {
		this.shop = shop;
	}
	public void run() {
        while (true) {
            try {
            	Thread.sleep(1000);
            	shop.produ();
            }
            catch(Exception e)
            {e.printStackTrace();}
        }
    }
}