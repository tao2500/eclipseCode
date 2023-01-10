package webBianCheng;//发送数据包p403  接收数据包
import java.io.IOException;
import java.net.*;
public class P408jieshoushujubao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			byte [] a=new byte[100];
			DatagramSocket jie=new DatagramSocket(2546);//创建接受邮递员
			DatagramPacket jieshou=new DatagramPacket(a,100);//命令接受的数据长度及存放地
			jieshou.getAddress();//获取发送方地址
			jie.receive(jieshou);//接受数据
		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}
