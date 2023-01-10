package DuoXianCheng;

public class p365 {
	public static void main(String[] ards){
		Thread speakElephant;
		Thread speakCar;
		ElephantTarget elephant;
		CarTarget car;
		elephant = new ElephantTarget();
		car=new CarTarget();
		speakElephant = new Thread(elephant);
		speakCar = new Thread(car);
		speakElephant.start();
		speakCar.start();
		for(int i=1;i<=20;i++){
			System.out.print("´óÏó"+i+"  ");
		}
	}
}
