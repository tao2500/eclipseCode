package lianxi3;
import java.io.*;
public class ²âÊÔ extends Exception{
	int m;
	²âÊÔ (int m){
		this.m=m;
	}
	int get(){
		return m;
	}
}

class teacher{
	public int givesoce(int souce) throws ²âÊÔ(){
		if(souce>100){
			throw new test(souce);
		}
		return souce;
	}

}

