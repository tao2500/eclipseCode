package class_one;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SeqStack st = new SeqStack();
		System.out.println("��ǰ˳��ջ�Ƿ�Ϊ�գ�"+st.isEmpty());
		st.push(1);
		st.push(2);
		System.out.println("����1 2��˳��ջ�Ƿ�Ϊ�գ�"+st.isEmpty());
		System.out.println("��վ��"+st.pop());
		System.out.println("��վ���ջ��Ϊ"+st.peek());
		
		System.out.println();
		System.out.println("������ջ");
		LinkedStack ls = new LinkedStack();
		System.out.println("��ǰ��ջ�Ƿ�Ϊ�գ�"+ls.isEmpty());
		ls.push(1);
		ls.push(2);
		ls.push(3);
		System.out.println("����1 2 3����ջ�Ƿ�Ϊ�գ�"+st.isEmpty());
		System.out.println("��վ��"+ls.pop());
		System.out.println("��վ���ջ��Ϊ"+ls.peek());
	}

}
