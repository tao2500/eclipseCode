package class_one;

public class doLinkedQueue {
	public static void main(String[] args) {
		LinkedQueue li = new LinkedQueue();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		System.out.println("add : 1 2 3 4 5");
		System.out.println(li.toString());
		System.out.println("队列长度为"+li.size());
		System.out.println("poll : 1 2 3 4 5");
		li.poll();
		li.poll();
		li.poll();
		li.poll();
		li.poll();
		System.out.println("队列长度为"+li.size());
	}
		
}
