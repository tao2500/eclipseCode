package class_one;

import java.util.Scanner;

public class ������� {
	//˳��ջʵ��
	public static void main (String args[]){
		System.out.println("���²���˳��ջʵ��");
		char ch;
		SeqStack st = new SeqStack();
		Scanner s = new Scanner(System.in);
		System.out.println("������Ҫ��������ƥ���ʽ��");
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
				st.push("ȱ�٣�");
				break;
			}else i+=1;
		}
		if(st.isEmpty()){
			System.out.println("�ܹ���ȷƥ��");
		}else System.out.println("���ܹ���ȷƥ��");
		
		
		
		
		
		System.out.println("���²���˳��ջʵ��");
		LinkedStack ls = new LinkedStack();
		s = new Scanner(System.in);
		System.out.println("������Ҫ��������ƥ���ʽ��");
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
				ls.push("ȱ�٣�");
				break;
			}else i+=1;
		}
		if(ls.isEmpty()){
			System.out.println("�ܹ���ȷƥ��");
		}else System.out.println("���ܹ���ȷƥ��");
	}
	
}
