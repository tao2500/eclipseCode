package keben;

public class MainClass {
	public static void main(String[]args){
		TV haierTV=new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV��Ƶ����"+haierTV.getChanne1());
		Family zhangSanFamily=new Family();
		zhangSanFamily.buyTV(haierTV);
		System.out.println("zhangSanFamily��ʼ�����ӽ�Ŀ");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily�������л���"+m+"Ƶ��");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV��Ƶ����"+haierTV.getChanne1());
		System.out.println("zhangSanFamily�ٿ����ӽ�Ŀ");
		zhangSanFamily.seeTV();
	}
}
