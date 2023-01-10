package studentAdministration;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Find {
	public void findId(File txt,ArrayList<Student> l,String id){//按学号查
		Iterator<Student> iter=l.iterator();
		while(iter.hasNext()){
			Student s=iter.next();
			if(s.getId().equals(id)){
				System.out.println("学号为"+id+"的学生的信息如下：");
				System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber());
				break;
			}
			else System.out.println("该学生不存在");
		}
		new Homing(txt,l);
	}
	public void findName(File txt,ArrayList<Student> l,String name){//按姓名查
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getname().equals(name)){
				++aa;
				if(aa==1){
					System.out.println("姓名为"+name+"的学生的信息如下：");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber()+"                     这是第"+aa+"行内容！");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("！！！所有信息已输出。若输出信息为空 则表示该学生不存在！！！");
			}
		}
		new Homing(txt,l);
	}
	public void findCallphoneNumber(File txt,ArrayList<Student> l,String callphonenumber){//按电话号码查
		Iterator<Student> iter=l.iterator();
		int a=0;
		while(a<l.size()){
			a++;
			Student s=iter.next();
			if(s.getCallphonenumber().equals(callphonenumber)){
				System.out.println("电话号码为"+callphonenumber+"的学生的信息如下：");
				System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber());
				break;
			}
			else if(a==l.size()){
				System.out.println("该学生不存在!");
			}
		}
		new Homing(txt,l);
	}
	public void findDormitoryNumber(File txt,ArrayList<Student> l,String Dormitorynumber){//按宿舍号查
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getDormitorynumber().equals(Dormitorynumber)){
				++aa;
				if(aa==1){
					System.out.println("住在"+Dormitorynumber+"宿舍的学生的信息如下：");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber()+"                     这是第"+aa+"行内容！");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("！！！所有信息已输出。若输出信息为空 则表示该宿舍没有学生入住！！！");
			}
		}
		new Homing(txt,l);
	}
	public void findClassNumber(File txt,ArrayList<Student> l,String classnumber){//按班级查
		Iterator<Student> iter=l.iterator();
		int a=0,aa=0;
		while(iter.hasNext()){
			++a;
			Student s=iter.next();
			if(s.getClassnumber().equals(classnumber)){
				++aa;
				if(aa==1){
					System.out.println(classnumber+"班的学生的信息如下：");
					System.out.println();
					}
				System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber()+"                     这是第"+aa+"行内容！");
			}
			else if(a==l.size()){
				System.out.println();
				System.out.println("！！！所有信息已输出。若输出信息为空 则表示没有该班级！！！");
			}
		}
		new Homing(txt,l);
	}
	public void show(File txt,ArrayList<Student> l){
		int i=1;
		System.out.println("本系统所有学生信息如下：");
		Iterator<Student> iter=l.iterator();
		Student s;
		if(!iter.hasNext()){
			System.out.println("该系统还没有学生信息，快去添加吧！");
		}
		while(iter.hasNext()){
			s=iter.next();
			System.out.println("ID:"+s.getId()+", 姓名:"+s.getname()+", 电话号码:"+s.getCallphonenumber()+", 宿舍号:"+s.getDormitorynumber()+", 班级:"+s.getClassnumber()+"                     这是第"+i+"行内容！");
			i+=1;
		}
		new Homing(txt,l);
	}
}
