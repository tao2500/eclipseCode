package intelligentExpressCabinet;
import java.util.*;
public class SignIn {
	public SignIn(int [][] lattice){
		System.out.println("�����뱾��Ĺ������룡");
		final int password = 12345666;
		Scanner s = new Scanner(System.in);
		int pass = s.nextInt();
		if(pass == password){
			System.out.println("��¼�ɹ�����ӭ��������Ա��");
			new Courier(lattice);
		}else{
			System.out.println("����Ա�����������");
			System.out.println("�Ƿ������¼�� ��1����   ���������� ");
			int judge = s.nextInt();
			if(judge == 1){
				new SignIn(lattice);
			}else{
				new ExpressCabinet();
			}
		}
	}

}
