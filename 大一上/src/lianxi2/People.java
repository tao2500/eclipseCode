package lianxi2;
//������
//public�������Ȩ��
public class People {
	int height;
	String ear;
	void speak(String s) {  //��ʼ��һ������
		System.out.println(s);
	}

}
class A {
	public static void main(String args[]){
		People zhubajie;
		zhubajie = new People();
		zhubajie.height = 170;
		zhubajie.ear = "��ֻ�����";
		System.out.println("���:"+zhubajie.height);
		System.out.println(zhubajie.ear);
		zhubajie.speak("ʦ��,���ű�ȥ������,��ȥ�¹���");
				
				
	}
}
