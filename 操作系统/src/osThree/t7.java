//package osThree;
//import java.util.ArrayList;
//import java.util.List;
//public class t7 {
//	public static void main(String[] args) {
//		Shop shop = new Shop();   //商店类
//	    Producer pro = new Producer(shop); //生产者
//	    Cousumer cou = new Cousumer(shop); //顾客
//	    new Thread(pro).start();
//	    new Thread(cou).start();
//	}
//}
//
//class Product { //产品类
//
//  
//}
//
//class Shop {
//	private static List<Product> list = new ArrayList<Product>(); //产品列表
//	public synchronized  void  produ() { //同步方法，生产产品
//		while (list.size()== 10) {
//			try {
//				System.out.println("full,waiting fo produce");
//				wait();// 商品列表已满，等待消费
//	            }
//			catch(Exception e)
//			{e.printStackTrace();}	
//	     } 
//	     Product product = new Product(); //创建新产品
//	     list.add(product);
//	     System.out.println("producing"  );//生产
//	     System.out.println("amount of product is " + list.size()); //产品数量
//	     notify();  // 通知（唤醒）消费者来消费
//    }
//    
//	public synchronized void cousu() { //同步方法，消费产品
//        while (list.size() == 0) {
//            System.out.println("empty ,waiting for comsume"); //空的，等待生产
//            try {
//                wait();
//            }  
//            catch(Exception e)
//            {e.printStackTrace();}
//        }
//        list.remove(0);
//        System.out.println("comsuming" );//消费
//        System.out.println("amount of product is " + list.size());//剩余产品量
//        notify();//唤醒生产者
//    }
//}
//
//class Cousumer implements Runnable {
//	private Shop shop;
//	public Cousumer(Shop shop){
//		this.shop = shop;
//    }
//	public void run() {
//		while (true) {
//			try {
//				Thread.sleep(1000);
//				shop.cousu(); //消费一件产品
//			}
//			catch(Exception e)
//			{e.printStackTrace();}
//        }
//    }
//}
//
//class Producer implements Runnable { //生产者
//	private Shop shop;
//	public Producer(Shop shop) {
//		this.shop = shop;
//	}
//	public void run() {
//        while (true) {
//            try {
//            	Thread.sleep(1000);//生产用时1s
//            	shop.produ();//生产产品
//            }
//            catch(Exception e)
//            {e.printStackTrace();}
//        }
//    }
//}