package lianxi3;
import java.io.*;
public class ���� extends Exception{
	int m;
	���� (int m){
		this.m=m;
	}
	int get(){
		return m;
	}
}

class teacher{
	public int givesoce(int souce) throws ����(){
		if(souce>100){
			throw new test(souce);
		}
		return souce;
	}

}

