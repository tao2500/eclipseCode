package lianxi2;

public class Mingganci {
	String s;
	Mingganci(String ss){
		s=ss;
	}
	public void dealWith(){
		String regex="���ֹ�|����������̳|������ǹ";
		String dealWith=s.replaceAll(regex,"***");
		System.out.println("���������������Ϊ��"+dealWith);//����ֱ�����s ��Ϊ�ַ�����������
	}
}
