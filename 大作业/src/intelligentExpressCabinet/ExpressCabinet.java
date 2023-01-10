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
	int[][] lattice = {{this.getBig(),this.getMedium(),this.getSmall()},{0,0,0}};//初始化该快递柜所有的格子数量及实际使用量。
	public ExpressCabinet(){
		System.out.println("欢迎使用智能快递柜！");
		System.out.println("请选择你的身份  ‘1’用户  ‘2’管理员。");
		Scanner s = new Scanner(System.in);
		int judgeNum = s.nextInt();
		if(judgeNum==1){
			new User();
		}else if(judgeNum==2){
			new SignIn(lattice);
		}else{
			System.out.println("输入有误，请重新输入！");
			new ExpressCabinet();
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new ExpressCabinet();
		
	}

}
