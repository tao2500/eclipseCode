package intelligentExpressCabinet;
import java.util.*;
public class User {
	int taken = 0;//δȡ�������
	public User(){
		
		Boolean b = this.verification();
		while(!b){
			System.out.println("ȡ����������������� ����0������ȡ��");
			b=this.verification();
		}
		if(b){
			System.out.println("ȡ���ɹ���ȡ������ţ�");
			taken -= 1;
			if(taken>0){
				System.out.println("������"+ taken +"�����δȡ���Ƿ����ȡ��   ��1������ȡ��  ���������˳�");
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
				if(i == 1){
					new User();
				}else{
					System.out.println("�ڴ������ٴ�ʹ�ã�");
					new ExpressCabinet();
				}
			}
			new ExpressCabinet();
		
		}
	}

	public Boolean verification(){  //��֤����
		System.out.println("������ȡ����");
		Scanner s = new Scanner(System.in);
		String PickUpCode = s.next();
		taken = new Read().getTaken(PickUpCode);//��ȡδȡ�������
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
