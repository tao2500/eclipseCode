package studentAdministration;

import java.io.File;
import java.util.ArrayList;

public class Delete {
	public ArrayList<Student> Delete(ArrayList<Student> l,int i,File txt){
		--i;
		if(i<l.size()){
			l.remove(i);
			System.out.println("原数据删除成功！");
		}else System.out.println("该学生不存在！");
		return l;
	}
}

