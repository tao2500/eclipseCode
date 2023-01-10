package DuoXianCheng;
import java.net.*;
import java.io.*;
import java.util.Scanner;;
public class Zuoye_jiexingxi extends Thread{
	Zuoye_jiexingxi(Socket so){
		Scanner ac=new Scanner(System.in);
		try {
			OutputStream os=so.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
			System.out.println("请输入要发送的内容");
			String a=ac.next();
			while(!a.equals("exit")){
				bw.write(a);
				bw.newLine();
				bw.flush();
				System.out.println("发送成功！请输入要继续发送的内容");
				a=ac.next();
			}
			bw.write("exit");
			bw.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}