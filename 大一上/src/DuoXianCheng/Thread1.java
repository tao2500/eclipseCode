package DuoXianCheng;
import java.util.*;
public class Thread1 implements Runnable {
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		Date time= new Date();//获取本机当前时间
		long timee=time.getTime();
		System.out.println("我在运行 ！"+timee);
		while(1==1){
			Date newtime=new Date();//不断获取新时间
			long newtimee=newtime.getTime();
			newtimee=newtime.getTime();
			if((newtimee-timee)%3000==0){
				System.out.println("我在运行 ！"+newtime);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	 }

}