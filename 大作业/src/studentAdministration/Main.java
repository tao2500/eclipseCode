package studentAdministration;
import java.io.File;
public class Main {
	public static void main(String[] args) {
		File txt=new File("D:\\3班文档\\学生信息管理系统\\学生信息.txt");
		System.out.println("欢迎使用学生管理系统！");
		System.out.println();
		new FunctionSelection(txt);
	}
}
