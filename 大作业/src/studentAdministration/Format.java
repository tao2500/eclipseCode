package studentAdministration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Format {
	Format(File f){
		try {
			BufferedWriter format=new BufferedWriter(new FileWriter(f));
			format.write("ѧ��                     "+"����         "+"�绰����  "+"�����     "+"�༶  ");
			format.newLine();
			format.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}

