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
		case 1:System.out.println("综合频道");
			break;
		case 2:System.out.println("经济频道");
		break;
		case 3:System.out.println("文艺频道");
		break;
		case 4:System.out.println("国际频道");
		break;
		case 5:System.out.println("体育频道");
		break;
		default:System.out.println("不能收看"+channe1+"频道");
		}
	}
	
}
