package DuoXianCheng;
import java.util.*;
public class Thread1 implements Runnable {
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		Date time= new Date();//��ȡ������ǰʱ��
		long timee=time.getTime();
		System.out.println("�������� ��"+timee);
		while(1==1){
			Date newtime=new Date();//���ϻ�ȡ��ʱ��
			long newtimee=newtime.getTime();
			newtimee=newtime.getTime();
			if((newtimee-timee)%3000==0){
				System.out.println("�������� ��"+newtime);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	 }

}