package studentAdministration;

import java.io.File;
import java.util.ArrayList;

public class Leave {
	Leave(File txt,ArrayList<Student> l){
		new Format(txt);
		new WriterTxt(txt,l);
		System.out.println("您已经退出系统，期待您的再次使用，再见！");
	}
}
