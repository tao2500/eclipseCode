package DuoXianCheng;
import java.net.*;
import java.io.*;
public class Zuoye_kehududuan1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Socket s= new Socket("127.0.0.1",6321);
			
			Zuoye_jiexingxi jie=new Zuoye_jiexingxi(s);
			Zuoye_shouxingxi shou=new Zuoye_shouxingxi(s);
			jie.start();
			shou.start();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}	
	}

}
