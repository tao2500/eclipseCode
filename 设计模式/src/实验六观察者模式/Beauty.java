package ʵ�����۲���ģʽ;

public class Beauty extends Subject{
	@Override
	public void say(String message) {
		// TODO �Զ����ɵķ������
		for(Object o : al){
			((Hunter) o).read(message);
		}
	}

}
