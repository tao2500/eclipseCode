package studentAdministration;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Find {
	public void findId(File txt,ArrayList<Student> l,String id){//��ѧ�Ų�
		Iterator<Student> iter=l.iterator();
		while(iter.hasNext()){
			Student s=iter.next();
			if(s.getId().equals(id)){
				System.out.println("ѧ��Ϊ"+id+"��ѧ������Ϣ���£�");
				System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber());
				break;
			}
			else System.out.println("��ѧ��������");
		}
		new Homing(txt,l);
	}
	public void findName(File txt,ArrayList<Student> l,String name){//��������
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getname().equals(name)){
				++aa;
				if(aa==1){
					System.out.println("����Ϊ"+name+"��ѧ������Ϣ���£�");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber()+"                     ���ǵ�"+aa+"�����ݣ�");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("������������Ϣ��������������ϢΪ�� ���ʾ��ѧ�������ڣ�����");
			}
		}
		new Homing(txt,l);
	}
	public void findCallphoneNumber(File txt,ArrayList<Student> l,String callphonenumber){//���绰�����
		Iterator<Student> iter=l.iterator();
		int a=0;
		while(a<l.size()){
			a++;
			Student s=iter.next();
			if(s.getCallphonenumber().equals(callphonenumber)){
				System.out.println("�绰����Ϊ"+callphonenumber+"��ѧ������Ϣ���£�");
				System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber());
				break;
			}
			else if(a==l.size()){
				System.out.println("��ѧ��������!");
			}
		}
		new Homing(txt,l);
	}
	public void findDormitoryNumber(File txt,ArrayList<Student> l,String Dormitorynumber){//������Ų�
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getDormitorynumber().equals(Dormitorynumber)){
				++aa;
				if(aa==1){
					System.out.println("ס��"+Dormitorynumber+"�����ѧ������Ϣ���£�");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber()+"                     ���ǵ�"+aa+"�����ݣ�");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("������������Ϣ��������������ϢΪ�� ���ʾ������û��ѧ����ס������");
			}
		}
		new Homing(txt,l);
	}
	public void findClassNumber(File txt,ArrayList<Student> l,String classnumber){//���༶��
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getClassnumber().equals(classnumber)){
				++aa;
				if(aa==1){
					System.out.println(classnumber+"���ѧ������Ϣ���£�");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber()+"                     ���ǵ�"+aa+"�����ݣ�");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("������������Ϣ��������������ϢΪ�� ���ʾû�иð༶������");
			}
		}
		new Homing(txt,l);
	}
	public void show(File txt,ArrayList<Student> l){
		int i=1;
		System.out.println("��ϵͳ����ѧ����Ϣ���£�");
		Iterator<Student> iter=l.iterator();
		Student s;
		if(!iter.hasNext()){
			System.out.println("��ϵͳ��û��ѧ����Ϣ����ȥ��Ӱɣ�");
		}
		while(iter.hasNext()){
			s=iter.next();
			System.out.println("ID:"+s.getId()+", ����:"+s.getname()+", �绰����:"+s.getCallphonenumber()+", �����:"+s.getDormitorynumber()+", �༶:"+s.getClassnumber()+"                     ���ǵ�"+i+"�����ݣ�");
			i+=1;
		}
		new Homing(txt,l);
	}
}
