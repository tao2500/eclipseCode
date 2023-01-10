package studentAdministration;

import java.io.*;
import java.util.*;

public class RedTxt{
	File f;
	RedTxt(){
	}
	RedTxt(File f){
		this.f=f;
	}
	public ArrayList<Student> star(){
		ArrayList<Student> list=new ArrayList<Student>();
		//Student s=new Student();Ӧ�ŵ�23��
		try {
			BufferedReader redtxt=new BufferedReader(new FileReader(f));
			String regex=", ";
			String data[]=new String[5];
			String contentTitle=redtxt.readLine();
			String content=redtxt.readLine();
			int a=0;
			while(content!=null){
				Student s=new Student();
				data=content.split(regex);
				s.setId(data[0]);
				s.setMane(data[1]);
				s.setCallphonenumber(data[2]);
				s.setDormitorynumber(data[3]);
				s.setClassnumber(data[4]);
				list.add(s);
				content=redtxt.readLine();
			}
			redtxt.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return list;
	}
}
