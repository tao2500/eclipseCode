package studentAdministration;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Homing {
	Homing(ArrayList<Student> l,File txt){//��ɾ����
		new Format(txt);
		new WriterTxt(txt,l);
		System.out.println("����1���������˵�������88���˳�ϵͳ��");
		Scanner sca=new Scanner(System.in);
		int choice;
		choice=sca.nextInt();
		if(choice==1){
			new FunctionSelection(txt);
		}
		else if(choice==88){
			new Leave(txt,l);
		}
		else{
			System.out.println("����Υ�棡�������������룡����");
			new Homing(l,txt);
		}
	}
	Homing(File txt,ArrayList<Student> l){//����
		System.out.println("����1���������˵�������88���˳�ϵͳ��");
		Scanner sca=new Scanner(System.in);
		int choice;
		choice=sca.nextInt();
		if(choice==1){
			new FunctionSelection(txt);
		}
		else if(choice==88){
			new Leave(txt,l);
		}
		else{
			System.out.println("����Υ�棡�������������룡����");
			new Homing(l,txt);
		}
	}
}
