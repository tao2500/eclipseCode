package ������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.omg.CORBA.portable.OutputStream;

public class Client {
	public static void main(String[] args) {   //10.6.2.35   //172.24.156.227
		// TODO �Զ����ɵķ������
		try {
			System.out.println("�ͻ��˷�������");
			Socket client=new Socket("120.236.146.40",14855);
			System.out.println("�ͻ��������ͳɹ�");
			InetAddress address=client.getInetAddress();//��ȡ��������ַ
			System.out.println("�������ĵ�ַΪ��"+address.toString());
			FileInputStream fis = new FileInputStream("");//�ļ�����
			byte buffer[];
			ByteArrayOutputStream baos = new ByteArrayOutputStream(fis.available());
			byte[] bytes = new byte[fis.available()];
			int temp;
			while ((temp = fis.read(bytes)) != -1) {
			          baos.write(bytes, 0, temp);
			}
			System.out.println("�ļ����ͳɹ���");
			fis.close();
			baos.close();
			buffer = baos.toByteArray();
			java.io.OutputStream os=client.getOutputStream();//��������ַ���
			os.write(buffer);
//			OutputStreamWriter osw=new OutputStreamWriter(os);//�ַ���ת�ֽ���
//			BufferedWriter bw =new BufferedWriter(osw);
//			Scanner in=new Scanner(System.in);
//			String content=in.next();
//			while(!content.equals("exit")){
//				bw.write(content);
//				bw.newLine();//����
//				bw.flush();//���ڴ�
//				content=in.next();
//			}
//			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//			String line = br.readLine();
//			System.out.println("���Է���������Ϣ"+line);
			os.close();
//			br.close(); 
//			bw.close();
//			client.close();
			
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
}
