package webBianCheng;
	import java.net.*;
public class P398 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
		InetAddress add=InetAddress.getByName("https://www.w3school.com.cn");
		System.out.println(add.toString());
		System.out.println(add.getHostName());//��ȡ����
		System.out.println(add.getHostAddress());//��ȡip��ַ
		}
		catch(UnknownHostException e){
			System.out.println("�޷��ҵ�����ҳ��");
		}
		try {
			InetAddress benji=InetAddress.getLocalHost();//��ȡ�����ĵ�ַ
			System.out.println(benji.toString());
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println("�޷��ҵ�������");
		}//
	}

}
