package hanno;
import java.util.Scanner;
import java.util.Stack;
public class HannoTest {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HanNo hn = new HanNo();
		Scanner sc = new Scanner(System.in); 
		System.out.println("������A����ʼ������");
		int num = sc.nextInt(); 
		sc.close();
		System.out.println("�ܹ��ƶ�����Ϊ��"+hn.createHannNo(num));
		Stack<Integer> c = hn.getcolumnC();
		System.out.println("C���е����Ӵ�������Ϊ��"+c);
	}
}
