package new_IO;
import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.*;
public class CMDTest {
	File f;
	CMDTest(){
		f=new File(".");
	}
	String[] getRoot(){
		File link[]=f.listRoots();    //获取文件目录
		String s[]=new String[link.length];
		for(int i=0;i<link.length;i++){
			s[i]=link[i].toString();
		}
		return s;
	}
	void getChild(){
		String line[]=f.list();
		if(f.isFile()){
			System.out.println("当前为文件，没有包含子目录和文件。");
		}

		for(String s:line){
			System.out.println(s);
		}
	}
	void updateFile(String s){
		String g=new String();
		//File fi=new File(s);
		String ff=f.getAbsolutePath();//获取绝对地址
		StringTokenizer fff=new StringTokenizer(ff,"\\");
		int i=0;
		while(fff.hasMoreTokens()){
			fff.nextToken();
			i=i+1;
		}
		StringTokenizer ffff=new StringTokenizer(ff,"\\");
		String line[]=f.list();
		if(s.equals("../")){
			for(int ii=0;ii<i-2;ii++){
				if(ii==0){
					g=g+ffff.nextToken();
				}else
				g=g+"\\"+ffff.nextToken();
			}
			f=new File(g);
			}
		else if(s!=null){
			for(int q=0;q<line.length;q++){
				if(line[q].equals(s)){
				String ss=(f+"\\"+s).toString();
				f=new File(ss);
			}
		}
		}
		else
			System.out.println("ERROR");
	}	
	public static void main (String[] args){
		CMDTest c=new CMDTest();
		System.out.println("当前目录中所有的文件和目录如下：");
		c.getChild();
		for(;1==1;){
			System.out.println("请输入要跳转的目录位置：");
			Scanner input=new Scanner(System.in);
			String q=input.next();
			c.updateFile(q);
			System.out.println("更新后的目录中所有的文件和目录如下：");
			c.getChild();
		}
		
	}
	
}
