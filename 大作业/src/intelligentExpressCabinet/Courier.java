package intelligentExpressCabinet;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Courier {
	public Courier(){
		
	};
	public Courier(int[][] lattice){
		System.out.println("请选择你要使用的功能");
		System.out.println("‘1’派送快递  ‘2’查询格口剩余状况  ‘3’退出登录  ‘4’查询快递收取情况  ‘5’取出快递");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i){
			case 1:
				this.one(lattice);
				break;
			case 2:
				this.two(lattice);
				break;
			case 3:
				System.out.println("期待您的再次使用！");
				new ExpressCabinet();
				break;
			case 4:
				this.four(lattice);
				break;
			case 5:
				this.five(lattice);
				break;
			default:
				System.out.println("输入有误，请重新输入！");
				new Courier(lattice);
		}
	}
	
	public void one(int[][] lattice){
		String name;
		String telephone;
		String entrytime;
		String pickupcode;
		String size="";
		LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        entrytime = localDateTime.format(dtf);
        pickupcode = this.GenerateCode();
        Boolean bool = new Dbutil().querySql(pickupcode);//验证取件码是否重复
        while(bool){
        	 pickupcode = this.GenerateCode();
        	 bool = new Dbutil().querySql(pickupcode);
        }
		System.out.print("请选择快递格规格 ‘1’大格 ‘2’中格 ‘3’小格");
		Scanner sc = new Scanner(System.in);
		int siz = sc.nextInt();
		lattice = this.updata(lattice);
		if(siz == 1&&(lattice[0][0]-lattice[1][0])>0){
			size = "大格";
		}else if(siz == 2&&(lattice[0][1]-lattice[1][1])>0){
			size = "中格";
		}else if(siz == 3&&(lattice[0][2]-lattice[1][2])>0){
			size = "小格";
		}else{
			System.out.println("缺少当前所选格子规格，请在另一快递柜投递。");
			new Courier(lattice);
		}
		System.out.println("请录入快件信息");
		System.out.print("收货人：");
		name = sc.next();
		System.out.print("收货人电话：");
		telephone = sc.next();
		NoDe<String> no = new NoDe<String>(name,telephone,entrytime,pickupcode,size,null);
		new Write(no);
		System.out.println("是否继续派件？ ‘1’是  ‘其他’否");
		int operation = sc.nextInt();
		switch(operation){
		case 1:
			this.one(lattice);
			break;
		default:
			new Courier(lattice);
		}
	}
	
	public int[][] two(int[][] lattice){
		System.out.println("当前快递柜使用情况如下：");
		System.out.println("快递柜共有"+lattice[0][0]+"个大格，"+lattice[0][1]+"个中格，"+lattice[0][2]+"个小格");
		lattice = new Read().Readlattice(lattice);
		System.out.println("还可使用："+(lattice[0][0]-lattice[1][0])+"个大格，"+(lattice[0][1]-lattice[1][1])+" 个中格，"+(lattice[0][2]-lattice[1][2])+"个小格");
		new Courier(lattice);
		return lattice;
	}
	
	public void four(int[][] lattice){
		int sign = 0;//滞留快件总数
		SinglyList sl = new SinglyList();
		NoDe[] retention = new NoDe[sl.size()]; //滞留快件数组
		NoDe<String> head = sl.head;
		LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for(;head.getEntrytime()!=null;head = head.next){
        	 LocalDateTime dt = LocalDateTime.parse(head.getEntrytime(),dtf);
             Duration d = Duration.between(dt, localDateTime);//间隔时间
             long time = d.toHours();
             if(time>=24){
            	 retention[sign] = head;
            	 if(sign == 0){
            		 System.out.println("滞留快件信息如下：");
            	 }
            	 System.out.println("收货人："+head.getName()+",  联系电话"+head.getTelephone()+",  入柜时间"+head.getEntrytime());
            	 sign+=1;
             }
//             System.out.println("间隔时间"+d.toHours());
        }
        if(sign != 0){
        	System.out.println("请选择您要进行的操作  ‘1’重新投放所有滞留快件   ‘2’取出所有滞留快件    ‘其他’返回" );
        	Scanner sc = new Scanner(System.in);
        	int i = sc.nextInt();
        	Delate dela = new Delate();
        	if(i == 1){
        		String time;
        		for(int ii = 0;ii<sign;ii++){
        			dela.delateOnTelephone(retention[ii]);
        			time = localDateTime.format(dtf);
        			retention[ii].setEntrytime(time);
        			new Write(retention[ii]);
        		}
        		System.out.println("快件已重新投放！");
        		new Courier(lattice);
        	}else if(i == 2){
        		for(int ii = 0;ii<sign;ii++){
        			dela.delateOnTelephone(retention[ii]);
        		}
        		System.out.println("所有滞留快件窗口已打开！");
        		new Courier(lattice);
        	}else{
        		new Courier(lattice);
        	}
        }
        if(sign == 0){
        	System.out.println("未查询到滞留快件！");
        	new Courier(lattice);
        }
	}
	
	public void five(int [][] lattice){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要取出快递的手机号码");
		String st = sc.next();
		Boolean b = this.verification(st);
		if(b){
			System.out.println("取出成功！");
		}else{
			System.out.println("取件失败！未查询到该号码名下的快递");
		}
		System.out.println("是否继续取件  ‘1’是   ‘其他’否 ");
		int in = sc.nextInt();
		switch(in){
			case 1 :
				this.five(lattice);
				break;
			default:
				new Courier(lattice);
		}
	}
	
	public Boolean verification(String telephone){  //验证方法
		SinglyList<String> sl = new SinglyList<String>();
		int star = sl.size();
		new Delate().delateOnTelephone(new NoDe(null,telephone,null,null,null,null));
		sl = new SinglyList<String>();
		int end = sl.size();
		if(star == end){
			return false;
		}
		return true;
	}
	
	public String GenerateCode(){   //生成取件码
		 Random r = new Random();
	        String str = "";
	        for(int ii = 0;ii<8;ii++){
	        	str+=r.nextInt(9);
	        }
	       return str;
	}
	
	
	public int[][] updata(int[][] lattice){  //更新快递柜状态
		lattice = new Read().Readlattice(lattice);
		return lattice;
	}
}
