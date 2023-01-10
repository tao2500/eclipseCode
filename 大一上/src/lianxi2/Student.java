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
		String regex="20\\d{10}";//在20后面有10位数。
		if(schoolNum.matches(regex)){
			System.out.println("该学号合法");
		}
		else 
			System.out.println("该学号不合法");
	}
	public void pddh(String celephoneNumber){
		String regex="((13)|(15)|(16)|(17)|(18)|(19))\\d{9}";//还可以 1[3|5|6|7|8|9\\d{9}]
		if(celephoneNumber.matches(regex)){
			System.out.println("该电话号码合法");
		}
		else 
			System.out.println("该电话号码不合法");
	}
	public void pdyx(String email){
		boolean boo1=(email.startsWith("@")||email.endsWith("@")||email.endsWith("."))==false;
		boolean boo2=(email.indexOf("@")<(email.indexOf(".")-2)&&email.contains("."));
		if(boo1&&boo2){
			System.out.println("该邮箱地址合法");
		}
		else 
			System.out.println("该邮箱地址不合法");
	}
	public void toString(Student a){
		System.out.println("该学生的学号为:"+a.schoolNum+";电话为："+a.celephoneNumber+";姓名为："+a.name+";所在学院："+a.college+";电子邮箱为:"+a.email);

	}
}
