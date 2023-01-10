package class_one;

public class doSeqQueue {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SeqQueue que = new SeqQueue(5);
		que.add(10);
		que.add(20);
		System.out.println("队列长度为："+que.size());
		System.out.print(que.toString());
		System.out.print("front="+que.front);
		System.out.println("rear="+que.rear);
		que.poll();
		que.poll();
		System.out.println("pool : 10  20");
		System.out.println("队列长度为："+que.size());
		System.out.print(que.toString());
		System.out.print("front="+que.front);
		System.out.println("rear="+que.rear);
		que.add(30);
		que.add(40);
		que.add(50);
		System.out.println("队列长度为："+que.size());
		System.out.print(que.toString());
		System.out.print("front="+que.front);
		System.out.println("rear="+que.rear);
		que.add(60);
		que.add(70);
		que.add(80);
		System.out.println("队列长度为："+que.size());
		System.out.print(que.toString());
		System.out.print("front="+que.front);
		System.out.println("rear="+que.rear);
	}

}
