package keben;

public class TV {
	int channe1;
	void setChannel(int m){
		if(m>=1){
			channe1=m;
		}
	}
	int getChanne1(){
		return channe1;
	}
	void showProgram(){
		switch(channe1){
		case 1:System.out.println("�ۺ�Ƶ��");
			break;
		case 2:System.out.println("����Ƶ��");
		break;
		case 3:System.out.println("����Ƶ��");
		break;
		case 4:System.out.println("����Ƶ��");
		break;
		case 5:System.out.println("����Ƶ��");
		break;
		default:System.out.println("�����տ�"+channe1+"Ƶ��");
		}
	}
	
}
