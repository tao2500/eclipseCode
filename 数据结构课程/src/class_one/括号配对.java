package class_one;

import java.util.Scanner;

public class 括号配对 {
	//顺序栈实现
	public static void main (String args[]){
		System.out.println("以下采用顺序栈实现");
		char ch;
		SeqStack st = new SeqStack();
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要进行括号匹配的式子");
		String input = s.next();    //1*(2+3*(4*(2-1)*(3+x)+5)-6)   1*(2+3*4*(2-1)*(3+x)+5)-6)
		for(int i=0;i<input.length();){
			ch = input.charAt(i);
			if(ch=="(".charAt(0)){
				st.push("(");
				i+=1;
			}else if(ch==")".charAt(0)&&!st.isEmpty()){
				st.pop();
				i+=1;
			}else if(ch==")".charAt(0)&&st.isEmpty()){
				st.push("缺少（");
				break;
			}else i+=1;
		}
		if(st.isEmpty()){
			System.out.println("能够正确匹配");
		}else System.out.println("不能够正确匹配");
		
		
		
		
		
		System.out.println("以下采用顺序栈实现");
		LinkedStack ls = new LinkedStack();
		s = new Scanner(System.in);
		System.out.println("请输入要进行括号匹配的式子");
		input = s.next();    //1*(2+3*(4*(2-1)*(3+x)+5)-6)   1*(2+3*4*(2-1)*(3+x)+5)-6)
		for(int i=0;i<input.length();){
			ch = input.charAt(i);
			if(ch=="(".charAt(0)){
				ls.push("(");
				i+=1;
			}else if(ch==")".charAt(0)&&!ls.isEmpty()){
				ls.pop();
				i+=1;
			}else if(ch==")".charAt(0)&&ls.isEmpty()){
				ls.push("缺少（");
				break;
			}else i+=1;
		}
		if(ls.isEmpty()){
			System.out.println("能够正确匹配");
		}else System.out.println("不能够正确匹配");
	}
	
}
