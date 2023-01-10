package DuoXianCheng;

public class p362_xiancheng {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SpeakElephant speakElephant;
		SpeakCar speaCar;
		speakElephant=new SpeakElephant();
		speaCar=new SpeakCar();
		speakElephant.start();
		speaCar.start();
		for(int i=1;i<=15;i++){
			System.out.print("主人"+i+"  ");
		}
	}
}
