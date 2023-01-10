package class_one;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SeqStack st = new SeqStack();
		System.out.println("当前顺序栈是否为空？"+st.isEmpty());
		st.push(1);
		st.push(2);
		System.out.println("插入1 2后顺序栈是否为空？"+st.isEmpty());
		System.out.println("出站得"+st.pop());
		System.out.println("出站后的栈顶为"+st.peek());
		
		System.out.println();
		System.out.println("构建链栈");
		LinkedStack ls = new LinkedStack();
		System.out.println("当前链栈是否为空？"+ls.isEmpty());
		ls.push(1);
		ls.push(2);
		ls.push(3);
		System.out.println("插入1 2 3后链栈是否为空？"+st.isEmpty());
		System.out.println("出站得"+ls.pop());
		System.out.println("出站后的栈顶为"+ls.peek());
	}

}
