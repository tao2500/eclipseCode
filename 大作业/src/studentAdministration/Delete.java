package studentAdministration;

import java.io.File;
import java.util.ArrayList;

public class Delete {
	public ArrayList<Student> Delete(ArrayList<Student> l,int i,File txt){
		--i;
		if(i<l.size()){
			l.remove(i);
			System.out.println("ԭ����ɾ���ɹ���");
		}else System.out.println("��ѧ�������ڣ�");
		return l;
	}
}

