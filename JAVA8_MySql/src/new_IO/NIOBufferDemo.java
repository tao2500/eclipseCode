package new_IO;
import java.nio.CharBuffer;
public class NIOBufferDemo {
	public static void main(String [] args){
		CharBuffer buff = CharBuffer.allocate(8);
		System.out.println("capacity:" + buff.capacity());
		System.out.println("linit:" + buff.limit());
		System.out.println("positing: " + buff.position());
		buff.put('a');
		buff.put('b');
		buff.put('c');
		System.out.println("加入三个元素后，position = " + buff.position());
		buff.flip();
		System.out.println("执行flp后，linit = " +buff.limit());
		System.out.println("position = " +buff.position());
		System.out.println("第一个元素(position = 0):"  +buff.get());
		System.out.println("取出一个元素后，position = " + buff.position());
		buff.clear();
		System.out.println("执行 clear()后，limit = " +buff.limit());
		System.out.println("执行 clear()后, position = " +buff.position());
		System.out.println("执行clear()后，缓冲区内容没有被清除： "+ "第三个元素为： " + buff.get(2));
		System.out.println("执行绝对读取后，position = " + buff.position());
	}
}
