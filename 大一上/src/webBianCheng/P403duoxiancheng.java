package webBianCheng;
import java.io.IOException;
import java.net.*;
public class P403duoxiancheng {  //���̼߳�UDP�������ݰ�
	public static void main(String []args){
		Socket so=new Socket();
		InetSocketAddress soo=new InetSocketAddress("www.baidu.com.cn",2546);
		InetSocketAddress sooo=new InetSocketAddress("www.W3cschllo.com.cn",2102);
		try {
			so.connect(soo);
			so.getInetAddress();
			so.connect(sooo);
			so.getInetAddress();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		byte[]a=new byte[10];
		a="���".getBytes();
		InetAddress aa;
		try {//UDP���ݰ�
			aa = InetAddress.getByName("www.baidu.com.cn");
			DatagramPacket data=new DatagramPacket(a,a.length,aa,2546);//�������ڷ��͵����ݰ�
			data.getPort();//��ȡĿ��˿�
			DatagramSocket youdiyuan=new DatagramSocket();//�����ͼ����ʵ�Ա
			youdiyuan.send(data);//���Ͱ�
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			
		}

	}
}
