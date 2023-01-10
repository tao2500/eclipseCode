package new_IO;
import java.io.*;
import java.util.*;
public class LogRec {

	String time;
	String place;
	String DeparturePoint;
	String ArrivalPoint;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入1补充当前物流信息，输入2查看当前物流信息。");
		Scanner s=new Scanner(System.in);
		int in=s.nextInt();
		switch(in){
		case 1: {
			System.out.println("请输入当前时间、当前站点、物流出发网点、目的地网点。");
			Scanner ss=new Scanner(System.in);
			String input=ss.next();
			File f=new File("D://javacopytest/iotext.txt");
			try {
				BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));
				out.write(input);
				out.newLine();
				System.out.println("录入物流信息成功！");
				out.close();
				s.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
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
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("输出成功！");
				try {
					redtxt.close();
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		}
		
		
	}
}
