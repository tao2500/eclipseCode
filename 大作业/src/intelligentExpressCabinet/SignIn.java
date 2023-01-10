package intelligentExpressCabinet;
import java.util.*;
public class SignIn {
	public SignIn(int [][] lattice){
		System.out.println("请输入本柜的管理密码！");
		final int password = 12345666;
		Scanner s = new Scanner(System.in);
		int pass = s.nextInt();
		if(pass == password){
			System.out.println("登录成功！欢迎您，管理员。");
			new Courier(lattice);
		}else{
			System.out.println("管理员密码输入错误！");
			System.out.println("是否继续登录？ ‘1’是   ‘其他’否 ");
			int judge = s.nextInt();
			if(judge == 1){
				new SignIn(lattice);
			}else{
				new ExpressCabinet();
			}
		}
	}

}
