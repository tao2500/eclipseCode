package webBianCheng;//�������ݰ�p403  �������ݰ�
import java.io.IOException;
import java.net.*;
public class P408jieshoushujubao {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			byte [] a=new byte[100];
			DatagramSocket jie=new DatagramSocket(2546);//���������ʵ�Ա
			DatagramPacket jieshou=new DatagramPacket(a,100);//������ܵ����ݳ��ȼ���ŵ�
			jieshou.getAddress();//��ȡ���ͷ���ַ
			jie.receive(jieshou);//��������
		} catch (SocketException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}
