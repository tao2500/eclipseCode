package io;
import java.io.*;
public class Ce {
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		filter fi=new filter();
		File f=new File("D:\\Javacopytese");
		File ff=new File("D:\\Javacopytese\\jj.txst");
		if (f.mkdir()) {//创建文件夹
			System.out.println("文件夹创建成功。");
		}
		else{
			System.out.println("文件夹创建失败。");
		}
		try {
			if(ff.createNewFile()){//创建文件
				System.out.println("文件创建成功。");
			}
			else{
				System.out.println("文件创建失败。");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String a[]=f.list();//返回该目录下所有文件及文件夹
		int i=0;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		fi.setmane("jjva.text");
		String b[]=f.list(fi);
		for(i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		Runtime ce=Runtime.getRuntime();//折行可折行文件P284
		File file=new File("C:\\Program Files\\MySQL\\MySQL Workbench 8.0","MySQLWorkbench.exe");
		try {
			ce.exec(file.getAbsolutePath()); //折行文件
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
