package ������;

import java.io.*;
import java.net.*;
public class ������ {
public static void main(String[] args) {
	// TODO �Զ����ɵķ������
	try {
		ServerSocket server = new ServerSocket(4500);
		System.out.println("�ȴ��ͻ�����������");
		server.setSoTimeout(10000);//10����Ӧ��󴥷�SocketTimeoutException����
		Socket sc=server.accept();//�����߳�
		System.out.println("�������ӳɹ�");
		InetAddress address=sc.getInetAddress();//��ȡ�ͻ�����ַ
		System.out.println("�ͻ��˵�ַΪ��"+address.toString());
		InputStream is=sc.getInputStream();//�����ֽ�������
		BufferedReader br=new BufferedReader(new InputStreamReader(is));//�ֽ���ת�ַ���
		String str=br.readLine();
		while(!str.equals("exit")){
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		server.close();
	} catch (IOException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	catch(NullPointerException e){
		e.printStackTrace();
	}
	
}

}