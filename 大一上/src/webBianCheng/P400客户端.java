package webBianCheng;//�ͻ��ˣ��ͻ���Ϊ����Taojiezi
import java.io.*;
import java.net.*;
import java.util.*;
public class P400�ͻ��� {

	public static void main(String[] args) {   //10.6.2.35
		// TODO �Զ����ɵķ������
		try {
			System.out.println("�ͻ��˷�������");
			Socket client=new Socket("172.24.156.227",4500);
			System.out.println("�ͻ��������ͳɹ�");
			InetAddress address=client.getInetAddress();//��ȡ��������ַ
			System.out.println("�������ĵ�ַΪ��"+address.toString());
			OutputStream os=client.getOutputStream();//��������ַ���0
			OutputStreamWriter osw=new OutputStreamWriter(os);//�ַ���ת�ֽ���
			BufferedWriter bw =new BufferedWriter(osw);
			Scanner in=new Scanner(System.in);
			String content=in.next();
			while(!content.equals("exit")){
				bw.write(content);
				bw.newLine();//����
				bw.flush();//���ڴ�
				content=in.next();
			}
			bw.close();
			client.close();
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
