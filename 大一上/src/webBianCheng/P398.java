package webBianCheng;
	import java.net.*;
public class P398 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
		InetAddress add=InetAddress.getByName("https://www.w3school.com.cn");
		System.out.println(add.toString());
		System.out.println(add.getHostName());//获取域名
		System.out.println(add.getHostAddress());//获取ip地址
		}
		catch(UnknownHostException e){
			System.out.println("无法找到该网页！");
		}
		try {
			InetAddress benji=InetAddress.getLocalHost();//获取本机的地址
			System.out.println(benji.toString());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			System.out.println("无法找到本机！");
		}//
	}

}
