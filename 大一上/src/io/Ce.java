package io;
import java.io.*;
public class Ce {
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		filter fi=new filter();
		File f=new File("D:\\Javacopytese");
		File ff=new File("D:\\Javacopytese\\jj.txst");
		if (f.mkdir()) {//�����ļ���
			System.out.println("�ļ��д����ɹ���");
		}
		else{
			System.out.println("�ļ��д���ʧ�ܡ�");
		}
		try {
			if(ff.createNewFile()){//�����ļ�
				System.out.println("�ļ������ɹ���");
			}
			else{
				System.out.println("�ļ�����ʧ�ܡ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String a[]=f.list();//���ظ�Ŀ¼�������ļ����ļ���
		int i=0;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		fi.setmane("jjva.text");
		String b[]=f.list(fi);
		for(i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		Runtime ce=Runtime.getRuntime();//���п������ļ�P284
		File file=new File("C:\\Program Files\\MySQL\\MySQL Workbench 8.0","MySQLWorkbench.exe");
		try {
			ce.exec(file.getAbsolutePath()); //�����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class filter implements FilenameFilter{
	private String name;
	public void setmane(String a){
		name=a;
	}
	public boolean accept(File arg0, String arg1) {
		return arg1.endsWith(name);
	}
	
}
