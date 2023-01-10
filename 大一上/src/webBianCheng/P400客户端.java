package webBianCheng;//客户端；客户端为本包Taojiezi
import java.io.*;
import java.net.*;
import java.util.*;
public class P400客户端 {

	public static void main(String[] args) {   //10.6.2.35
		// TODO 自动生成的方法存根
		try {
			System.out.println("客户端发起请求");
			Socket client=new Socket("172.24.156.227",4500);
			System.out.println("客户端请求发送成功");
			InetAddress address=client.getInetAddress();//获取服务器地址
			System.out.println("服务器的地址为："+address.toString());
			OutputStream os=client.getOutputStream();//创建输出字符流0
			OutputStreamWriter osw=new OutputStreamWriter(os);//字符流转字节流
			BufferedWriter bw =new BufferedWriter(osw);
			Scanner in=new Scanner(System.in);
			String content=in.next();
			while(!content.equals("exit")){
				bw.write(content);
				bw.newLine();//换行
				bw.flush();//清内存
				content=in.next();
			}
			bw.close();
			client.close();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
