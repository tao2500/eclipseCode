package studentAdministration;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WriterTxt {
	WriterTxt(){
	}
	WriterTxt(File f,ArrayList<Student> l){
		Iterator<Student> iter=l.iterator();
		while(iter.hasNext()){
			Student s;
			s=iter.next();
				try {
					BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));
					out.write(s.getId()+", "+s.getname()+", "+s.getCallphonenumber()+", "+s.getDormitorynumber()+", "+s.getClassnumber());
					out.newLine();
					out.flush();
					out.close();
				} catch (FileNotFoundException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
	}
}
