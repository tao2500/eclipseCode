package intelligentExpressCabinet;
import java.util.Scanner;
public class ExpressCabinet {
	final int big = 3;
	final int medium = 10;
	final int small = 30;
	public int getBig() {
		return big;
	}
	public int getMedium() {
		return medium;
	}
	public int getSmall() {
		return small;
	}
	int[][] lattice = {{this.getBig(),this.getMedium(),this.getSmall()},{0,0,0}};//��ʼ���ÿ�ݹ����еĸ���������ʵ��ʹ������
	public ExpressCabinet(){
		System.out.println("��ӭʹ�����ܿ�ݹ�");
		System.out.println("��ѡ��������  ��1���û�  ��2������Ա��");
		Scanner s = new Scanner(System.in);
		int judgeNum = s.nextInt();
		if(judgeNum==1){
			new User();
		}else if(judgeNum==2){
			new SignIn(lattice);
		}else{
			System.out.println("�����������������룡");
			new ExpressCabinet();
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ExpressCabinet();
		
	}

}
