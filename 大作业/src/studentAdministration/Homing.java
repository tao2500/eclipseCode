package studentAdministration;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Homing {
	Homing(ArrayList<Student> l,File txt){//增删改用
		new Format(txt);
		new WriterTxt(txt,l);
		System.out.println("按’1‘返回主菜单，按’88‘退出系统，");
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
			System.out.println("输入违规！！！请重新输入！！！");
			new Homing(l,txt);
		}
	}
	Homing(File txt,ArrayList<Student> l){//查找
		System.out.println("按’1‘返回主菜单，按’88‘退出系统，");
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
			System.out.println("输入违规！！！请重新输入！！！");
			new Homing(l,txt);
		}
	}
}
