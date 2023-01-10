package io;
import java.io.*;
public class CopyPic {
	int a;//文件字节数
	byte []b=new byte[50000];//文件存储字节数组
	String srcPath;
	String dstPath;
	File src;
	File dst;
	CopyPic(){
	}
	CopyPic(String stcPath,String dstPath){
		this.srcPath=stcPath;
		this.dstPath=dstPath;
		src=new File(srcPath); 
		dst=new File(dstPath);
	}

	int detect(){
		if(src.exists()&&src.isFile()&&dst.isDirectory()){
			return 1;
		}
		else{
			return 0;
		}
	}
	int copy(){
		if(this.detect()==1){
			try{
				FileInputStream in= new FileInputStream(srcPath);
				a=in.read(b,0,50000);
				in.close();
			}
			catch(IOException e){
				System.out.println("inputException");
			}  //创建输入流
			try{
				FileOutputStream out=new FileOutputStream("D:\\javacopytest\\aim\\source.png");
				out.write(b,0,50000);
				out.close();
			}
			catch(IOException e){
				System.out.println("outException");
			}  //创建输出流
			return 1; 
		}
		return 0;
		
	}
}

class Test {
	public static void main(String[] args) {
		String srcPa="D:\\javacopytest\\source.png";//源文件
		String dstPath="D:\\javacopytest\\aim";//目的文件
		CopyPic copypic=new CopyPic(srcPa, dstPath);
		copypic.copy();
	}
}

