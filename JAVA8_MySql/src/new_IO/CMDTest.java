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
		File link[]=f.listRoots();    //��ȡ�ļ�Ŀ¼
		String s[]=new String[link.length];
		for(int i=0;i<link.length;i++){
			s[i]=link[i].toString();
		}
		return s;
	}
	void getChild(){
		String line[]=f.list();
		if(f.isFile()){
			System.out.println("��ǰΪ�ļ���û�а�����Ŀ¼���ļ���");
		}

		for(String s:line){
			System.out.println(s);
		}
	}
	void updateFile(String s){
		String g=new String();
		//File fi=new File(s);
		String ff=f.getAbsolutePath();//��ȡ���Ե�ַ
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
		System.out.println("��ǰĿ¼�����е��ļ���Ŀ¼���£�");
		c.getChild();
		for(;1==1;){
			System.out.println("������Ҫ��ת��Ŀ¼λ�ã�");
			Scanner input=new Scanner(System.in);
			String q=input.next();
			c.updateFile(q);
			System.out.println("���º��Ŀ¼�����е��ļ���Ŀ¼���£�");
			c.getChild();
		}
		
	}
	
}
