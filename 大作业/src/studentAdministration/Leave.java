package studentAdministration;

import java.io.File;
import java.util.ArrayList;

public class Leave {
	Leave(File txt,ArrayList<Student> l){
		new Format(txt);
		new WriterTxt(txt,l);
		System.out.println("���Ѿ��˳�ϵͳ���ڴ������ٴ�ʹ�ã��ټ���");
	}
}
