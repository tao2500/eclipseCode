package mysql;
import java.io.*;
public class P300 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TV changhong=new TV();
		changhong.setName("长虹电视");
		changhong.setPrice(5678);
		File file=new File("D:\\javacopytest\\iotest.txt");
		try {
			file.createNewFile();//创建文档；
			FileOutputStream fileout=new FileOutputStream(file);
			ObjectOutputStream objectout=new ObjectOutputStream(fileout);
			objectout.writeObject(changhong);
			objectout.close();
			FileInputStream filein=new FileInputStream(file);
			ObjectInputStream objectin=new ObjectInputStream(filein);
				TV xinfei=(TV)objectin.readObject();
				objectin.close();
				xinfei.setName("新飞电视");
				xinfei.setPrice(6666);
				System.out.println("changhong的名字"+changhong.getName());
				System.out.println("changhong的价格"+changhong.getPrice());
				System.out.println("xinfei的名字"+xinfei.getName());
				System.out.println("xinfei的价格"+xinfei.getPrice());
				
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
