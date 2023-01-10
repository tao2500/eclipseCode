package studentAdministration;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class FunctionSelection {
	FunctionSelection(File txt){
		Scanner sca=new Scanner(System.in);
		RedTxt rt=new RedTxt(txt);
		ArrayList<Student> list=rt.star();
		System.out.println("按’1‘查询本系统学生数据；按’2‘添加学生；按’3‘删除学生；按’4‘修改学生信息；按‘88’退出系统(按enter确定)");
		int select=sca.nextInt();
		switch(select){
			case 1:
				System.out.println("1.使用学生id查询；2.使用学生姓名查询；3.使用学生电话号码查询；4.使用学生宿舍号查询；5.使用学生班级查询；6.查询本系统所有学生");
				Find m=new Find();int select1=sca.nextInt();
				switch(select1){
					case 1:System.out.println("请输入学生id");
						String id=sca.next();
						m.findId(txt,list, id);
						break;
					case 2:System.out.println("请输入学生姓名");
						String name=sca.next();
						m.findName(txt,list, name);
						break;
					case 3:System.out.println("请输入学生电话号码");
						String callphonenumber=sca.next();
						m.findCallphoneNumber(txt,list, callphonenumber);
						break;
					case 4:System.out.println("请输入学生宿舍号");
						String Dormitorynumber=sca.next();
						m.findDormitoryNumber(txt,list, Dormitorynumber);
						break;
					case 5:System.out.println("请输入学生所在班级");
						String classnumber=sca.next();
						m.findClassNumber(txt,list, classnumber);
						break;
					case 6:m.show(txt,list);
						break;
					default:System.out.println("输入有误，请重新输入!!!");
						new FunctionSelection(txt);
					}
				break;
			case 2:Add add=new Add();
				list=add.returnn(list);
				new Homing(list,txt);
				break;
			case 3:System.out.println("请输入要删除学生所在输出表单中的行数");
				int input0=sca.nextInt();
				Delete de=new Delete();
				list=de.Delete(list, input0,txt);
				new Homing(list,txt);
				break;
			case 4:System.out.println("请输入要修改学生所在输出表单中的行数");
				int input=sca.nextInt();
				if(input<list.size()){
					Modify mo=new Modify();
					list=mo.Modify(list,input);
					Delete de1=new Delete();
					list=de1.Delete(list, input,txt);
					new Homing(list,txt);
				}
				else{
					System.out.println("该学生不存在");
					new Homing(list,txt);
				}
				break;
			case 88:new Leave(txt,list);
				break;
			default:System.out.println("输入有误，请重新输入!!!");
				new FunctionSelection(txt);
		}
		 
	}
	}
	