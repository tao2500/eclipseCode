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
		System.out.println("����1����ѯ��ϵͳѧ�����ݣ�����2�����ѧ��������3��ɾ��ѧ��������4���޸�ѧ����Ϣ������88���˳�ϵͳ(��enterȷ��)");
		int select=sca.nextInt();
		switch(select){
			case 1:
				System.out.println("1.ʹ��ѧ��id��ѯ��2.ʹ��ѧ��������ѯ��3.ʹ��ѧ���绰�����ѯ��4.ʹ��ѧ������Ų�ѯ��5.ʹ��ѧ���༶��ѯ��6.��ѯ��ϵͳ����ѧ��");
				Find m=new Find();int select1=sca.nextInt();
				switch(select1){
					case 1:System.out.println("������ѧ��id");
						String id=sca.next();
						m.findId(txt,list, id);
						break;
					case 2:System.out.println("������ѧ������");
						String name=sca.next();
						m.findName(txt,list, name);
						break;
					case 3:System.out.println("������ѧ���绰����");
						String callphonenumber=sca.next();
						m.findCallphoneNumber(txt,list, callphonenumber);
						break;
					case 4:System.out.println("������ѧ�������");
						String Dormitorynumber=sca.next();
						m.findDormitoryNumber(txt,list, Dormitorynumber);
						break;
					case 5:System.out.println("������ѧ�����ڰ༶");
						String classnumber=sca.next();
						m.findClassNumber(txt,list, classnumber);
						break;
					case 6:m.show(txt,list);
						break;
					default:System.out.println("������������������!!!");
						new FunctionSelection(txt);
					}
				break;
			case 2:Add add=new Add();
				list=add.returnn(list);
				new Homing(list,txt);
				break;
			case 3:System.out.println("������Ҫɾ��ѧ������������е�����");
				int input0=sca.nextInt();
				Delete de=new Delete();
				list=de.Delete(list, input0,txt);
				new Homing(list,txt);
				break;
			case 4:System.out.println("������Ҫ�޸�ѧ������������е�����");
				int input=sca.nextInt();
				if(input<list.size()){
					Modify mo=new Modify();
					list=mo.Modify(list,input);
					Delete de1=new Delete();
					list=de1.Delete(list, input,txt);
					new Homing(list,txt);
				}
				else{
					System.out.println("��ѧ��������");
					new Homing(list,txt);
				}
				break;
			case 88:new Leave(txt,list);
				break;
			default:System.out.println("������������������!!!");
				new FunctionSelection(txt);
		}
		 
	}
	}
	