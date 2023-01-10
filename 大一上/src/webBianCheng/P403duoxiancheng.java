package webBianCheng;
import java.io.IOException;
import java.net.*;
public class P403duoxiancheng {  //多线程及UDP发送数据包
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		byte[]a=new byte[10];
		a="你好".getBytes();
		InetAddress aa;
		try {//UDP数据包
			aa = InetAddress.getByName("www.baidu.com.cn");
			DatagramPacket data=new DatagramPacket(a,a.length,aa,2546);//创建用于发送的数据包
			data.getPort();//获取目标端口
			DatagramSocket youdiyuan=new DatagramSocket();//创建送件的邮递员
			youdiyuan.send(data);//发送包
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			
		}

	}
}
