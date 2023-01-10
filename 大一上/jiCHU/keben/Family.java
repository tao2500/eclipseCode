package keben;

public class Family {
	TV homeTV=new TV();
	void buyTV(TV tv){
		homeTV=tv;
	}
	void remoteControl(int m){
		homeTV.setChannel(m);
	}
	void seeTV(){
		homeTV.showProgram();
	}
}