package mysql;
import java.io.*;
public class P300 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TV changhong=new TV();
		changhong.setName("�������");
		changhong.setPrice(5678);
		File file=new File("D:\\javacopytest\\iotest.txt");
		try {
			file.createNewFile();//�����ĵ���
			FileOutputStream fileout=new FileOutputStream(file);
			ObjectOutputStream objectout=new ObjectOutputStream(fileout);
			objectout.writeObject(changhong);
			objectout.close();
			FileInputStream filein=new FileInputStream(file);
			ObjectInputStream objectin=new ObjectInputStream(filein);
				TV xinfei=(TV)objectin.readObject();
				objectin.close();
				xinfei.setName("�·ɵ���");
				xinfei.setPrice(6666);
				System.out.println("changhong������"+changhong.getName());
				System.out.println("changhong�ļ۸�"+changhong.getPrice());
				System.out.println("xinfei������"+xinfei.getName());
				System.out.println("xinfei�ļ۸�"+xinfei.getPrice());
				
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
