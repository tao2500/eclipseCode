package new_IO;
import java.io.*;
import java.util.*;
public class LogRec {

	String time;
	String place;
	String DeparturePoint;
	String ArrivalPoint;
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����1���䵱ǰ������Ϣ������2�鿴��ǰ������Ϣ��");
		Scanner s=new Scanner(System.in);
		int in=s.nextInt();
		switch(in){
		case 1: {
			System.out.println("�����뵱ǰʱ�䡢��ǰվ�㡢�����������㡢Ŀ�ĵ����㡣");
			Scanner ss=new Scanner(System.in);
			String input=ss.next();
			File f=new File("D://javacopytest/iotext.txt");
			try {
				BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));
				out.write(input);
				out.newLine();
				System.out.println("¼��������Ϣ�ɹ���");
				out.close();
				s.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
			}
			break;
		}
		case 2: {
			File f=new File("D://javacopytest/iotext.txt");
			FileReader reader=null;
			try {
				reader = new FileReader(f);
				BufferedReader redtxt=new BufferedReader(new FileReader(f));
				try {
					String content=redtxt.readLine();
					while(content!=null){
						System.out.println(content);
						content=redtxt.readLine();
					}
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("����ɹ���");
				try {
					redtxt.close();
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		}
		
		
	}
}
