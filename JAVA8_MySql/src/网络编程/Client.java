package 网络编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.omg.CORBA.portable.OutputStream;

public class Client {
	public static void main(String[] args) {   //10.6.2.35   //172.24.156.227
		// TODO 自动生成的方法存根
		try {
			System.out.println("客户端发起请求");
			Socket client=new Socket("120.236.146.40",14855);
			System.out.println("客户端请求发送成功");
			InetAddress address=client.getInetAddress();//获取服务器地址
			System.out.println("服务器的地址为："+address.toString());
			FileInputStream fis = new FileInputStream("");//文件名；
			byte buffer[];
			ByteArrayOutputStream baos = new ByteArrayOutputStream(fis.available());
			byte[] bytes = new byte[fis.available()];
			int temp;
			while ((temp = fis.read(bytes)) != -1) {
			          baos.write(bytes, 0, temp);
			}
			System.out.println("文件发送成功！");
			fis.close();
			baos.close();
			buffer = baos.toByteArray();
			java.io.OutputStream os=client.getOutputStream();//创建输出字符流
			os.write(buffer);
//			OutputStreamWriter osw=new OutputStreamWriter(os);//字符流转字节流
//			BufferedWriter bw =new BufferedWriter(osw);
//			Scanner in=new Scanner(System.in);
//			String content=in.next();
//			while(!content.equals("exit")){
//				bw.write(content);
//				bw.newLine();//换行
//				bw.flush();//清内存
//				content=in.next();
//			}
//			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//			String line = br.readLine();
//			System.out.println("来自服务器的消息"+line);
			os.close();
//			br.close(); 
//			bw.close();
//			client.close();
			
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
