package lianXi;
import java.util.Scanner;
class Test {
	public static void main (String [] args){
		Scanner abcd =new Scanner (System.in);
		Teacher a=new Teacher();
		Student b=new Student();
		System.out.println("��ֱ������ͬѧ��������ѧ�ţ�ԺУ");
		String na=abcd.next();
		b.setName(na);
		int su=abcd.nextInt();
		b.setID(su);
		String bran =abcd.next();
		b.setBranch(bran);
		System.out.println("��ֱ�����ý�ʦ�����������ţ�����");
		String na1=abcd.next();
		a.setName(na1);
		int su1=abcd.nextInt();
		a.setID(su1);
		String bran1 =abcd.next();
		a.setBranch(bran1);
		
		System.out.println("��ѧ��������Ϊ"+b.name);
		System.out.println("��ѧ����ѧ��Ϊ"+b.ID);
		System.out.println("��ѧ�����ڵ�ԺУΪ"+b.branch);
		System.out.println("��ѧ���ܽ���鱾��Ϊ"+b.sum);
		System.out.println("��ѧ�����������Ϊ��"+b.time);
		
		System.out.println("�ý�ʦ������Ϊ"+a.name);
		System.out.println("�ý�ʦ�Ĺ���Ϊ"+a.ID);
		System.out.println("�ý�ʦ���ڵĲ���Ϊ"+a.branch);
		System.out.println("�ý�ʦ�ܽ���鱾��Ϊ"+a.sum);
		System.out.println("�ý�ʦ���������Ϊ��"+a.time);
		

	}

}
