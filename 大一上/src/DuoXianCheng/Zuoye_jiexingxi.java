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
			System.out.println("������Ҫ���͵�����");
			String a=ac.next();
			while(!a.equals("exit")){
				bw.write(a);
				bw.newLine();
				bw.flush();
				System.out.println("���ͳɹ���������Ҫ�������͵�����");
				a=ac.next();
			}
			bw.write("exit");
			bw.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}