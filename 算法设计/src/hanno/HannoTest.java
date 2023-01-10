package hanno;
import java.util.Scanner;
import java.util.Stack;
public class HannoTest {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HanNo hn = new HanNo();
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入A柱初始盘子数");
		int num = sc.nextInt(); 
		sc.close();
		System.out.println("总共移动次数为："+hn.createHannNo(num));
		Stack<Integer> c = hn.getcolumnC();
		System.out.println("C柱中的盘子从下至上为："+c);
	}
}
