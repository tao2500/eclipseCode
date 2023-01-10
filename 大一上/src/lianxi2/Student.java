package lianxi2;

public class Student {
	String schoolNum;
	String celephoneNumber;
	String name;
	String college;
	String email;
	Student(){
		
	}
	Student(String schoolNum,String celephoneNumber,String name,String college,String email){
		this.schoolNum= schoolNum;
		this.celephoneNumber= celephoneNumber;
		this.name= name;
		this.college=college;
		this.email=email;
	}
	public String getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(String schoolNum) {
		this.schoolNum = schoolNum;
	}
	public String getCelephoneNumber() {
		return celephoneNumber;
	}
	public void setCelephoneNumber(String celephoneNumber) {
		this.celephoneNumber = celephoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void pdxh(String schoolNum){
		String regex="20\\d{10}";//��20������10λ����
		if(schoolNum.matches(regex)){
			System.out.println("��ѧ�źϷ�");
		}
		else 
			System.out.println("��ѧ�Ų��Ϸ�");
	}
	public void pddh(String celephoneNumber){
		String regex="((13)|(15)|(16)|(17)|(18)|(19))\\d{9}";//������ 1[3|5|6|7|8|9\\d{9}]
		if(celephoneNumber.matches(regex)){
			System.out.println("�õ绰����Ϸ�");
		}
		else 
			System.out.println("�õ绰���벻�Ϸ�");
	}
	public void pdyx(String email){
		boolean boo1=(email.startsWith("@")||email.endsWith("@")||email.endsWith("."))==false;
		boolean boo2=(email.indexOf("@")<(email.indexOf(".")-2)&&email.contains("."));
		if(boo1&&boo2){
			System.out.println("�������ַ�Ϸ�");
		}
		else 
			System.out.println("�������ַ���Ϸ�");
	}
	public void toString(Student a){
		System.out.println("��ѧ����ѧ��Ϊ:"+a.schoolNum+";�绰Ϊ��"+a.celephoneNumber+";����Ϊ��"+a.name+";����ѧԺ��"+a.college+";��������Ϊ:"+a.email);

	}
}
