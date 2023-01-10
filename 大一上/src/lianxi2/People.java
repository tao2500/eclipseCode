package lianxi2;
//公开类
//public定义访问权限
public class People {
	int height;
	String ear;
	void speak(String s) {  //开始另一个方法
		System.out.println(s);
	}

}
class A {
	public static void main(String args[]){
		People zhubajie;
		zhubajie = new People();
		zhubajie.height = 170;
		zhubajie.ear = "两只大耳朵";
		System.out.println("身高:"+zhubajie.height);
		System.out.println(zhubajie.ear);
		zhubajie.speak("师傅,砸门别去西天了,改去月宫吧");
				
				
	}
}
