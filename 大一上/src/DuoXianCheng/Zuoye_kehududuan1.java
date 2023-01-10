package DuoXianCheng;
import java.net.*;
import java.io.*;
public class Zuoye_kehududuan1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Socket s= new Socket("127.0.0.1",6321);
			
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
