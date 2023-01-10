package webBianCheng;//p400服务器
	import java.io.*;
	import java.net.*;
public class Taojiezi服务器 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			ServerSocket server = new ServerSocket(4500);
			System.out.println("等待客户的链接请求");
			server.setSoTimeout(10000);//10秒无应答后触发SocketTimeoutException错误
			Socket sc=server.accept();
			System.out.println("创建链接成功");
			InetAddress address=sc.getInetAddress();//获取客户机地址
			System.out.println("客户端地址为："+address.toString());
			InputStream is=sc.getInputStream();//创建输入流
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String str=br.readLine();
			while(!str.equals("exit")){
				System.out.println(str);
				str=br.readLine();
			}
			br.close();
			server.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		
	}

}
