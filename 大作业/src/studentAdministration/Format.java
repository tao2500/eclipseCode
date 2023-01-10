package studentAdministration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Format {
	Format(File f){
		try {
			BufferedWriter format=new BufferedWriter(new FileWriter(f));
			format.write("学号                     "+"姓名         "+"电话号码  "+"宿舍号     "+"班级  ");
			format.newLine();
			format.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

