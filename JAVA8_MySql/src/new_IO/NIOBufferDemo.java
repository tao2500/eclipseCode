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
		System.out.println("��������Ԫ�غ�position = " + buff.position());
		buff.flip();
		System.out.println("ִ��flp��linit = " +buff.limit());
		System.out.println("position = " +buff.position());
		System.out.println("��һ��Ԫ��(position = 0):"  +buff.get());
		System.out.println("ȡ��һ��Ԫ�غ�position = " + buff.position());
		buff.clear();
		System.out.println("ִ�� clear()��limit = " +buff.limit());
		System.out.println("ִ�� clear()��, position = " +buff.position());
		System.out.println("ִ��clear()�󣬻���������û�б������ "+ "������Ԫ��Ϊ�� " + buff.get(2));
		System.out.println("ִ�о��Զ�ȡ��position = " + buff.position());
	}
}
