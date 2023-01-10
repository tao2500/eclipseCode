package DuoXianCheng;
import java.net.*;
import java.io.*;
public class Zuoye_shouxingxi  extends Thread{
	Zuoye_shouxingxi(Socket so){
		try {
			InputStream in=so.getInputStream();
			BufferedReader bin=new BufferedReader(new InputStreamReader(in));
			String a=bin.readLine();
			while(!a.equals("exit")){
				System.out.println(a);
				a=bin.readLine();
			}
			bin.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
