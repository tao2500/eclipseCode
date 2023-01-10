package DuoXianCheng;
import java.net.*;
import java.io.*;
public class Zuoye_fuwuqi_server {
	public static void main(String [ ] args){
	try {
		ServerSocket server = new ServerSocket(6321);
		Socket s=server.accept();
		Zuoye_jiexingxi jie=new Zuoye_jiexingxi(s);
		Zuoye_shouxingxi shou=new Zuoye_shouxingxi(s);
		jie.start();
		shou.start();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}	
	}
}
