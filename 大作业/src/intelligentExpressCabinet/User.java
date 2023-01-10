package intelligentExpressCabinet;
import java.util.*;
public class User {
	int taken = 0;//未取快递数量
	public User(){
		
		Boolean b = this.verification();
		while(!b){
			System.out.println("取件码错误！请重新输入 按‘0’放弃取件");
			b=this.verification();
		}
		if(b){
			System.out.println("取件成功！取后请关门！");
			taken -= 1;
			if(taken>0){
				System.out.println("您还有"+ taken +"件快递未取！是否继续取件   ‘1’继续取件  ‘其他’退出");
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
				if(i == 1){
					new User();
				}else{
					System.out.println("期待您的再次使用！");
					new ExpressCabinet();
				}
			}
			new ExpressCabinet();
		
		}
	}

	public Boolean verification(){  //验证方法
		System.out.println("请输入取件码");
		Scanner s = new Scanner(System.in);
		String PickUpCode = s.next();
		taken = new Read().getTaken(PickUpCode);//获取未取快件数量
		if("0".equals(PickUpCode)){
			new ExpressCabinet();
		}
		SinglyList<String> sl = new SinglyList<String>();
		int star = sl.size();
		new Delate().delateOnPickUpCode(new NoDe(null,null,null,PickUpCode,null,null));
		sl = new SinglyList<String>();
		int end = sl.size();
		if(star == end){
			return false;
		}
		return true;
	}

}
