package studentAdministration;
import java.io.File;
public class Main {
	public static void main(String[] args) {
		File txt=new File("D:\\3���ĵ�\\ѧ����Ϣ����ϵͳ\\ѧ����Ϣ.txt");
		System.out.println("��ӭʹ��ѧ������ϵͳ��");
		System.out.println();
		new FunctionSelection(txt);
	}
}
