package ע��;

import java.lang.reflect.Method;


public class Customer {
	@Teest(num=1,price=23.5)
	public void buy(){
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Customer cm = new Customer();
		Class c = cm.getClass();
		Method[] math = c.getMethods();
//		Teest tes = Customer.class.getAnnotation(Teest.class);  //��ȡ��ע����Ϣ
		try {
			Method mth = Customer.class.getMethod("buy");
			Teest tst = mth.getAnnotation(Teest.class);  //��ȡ������ע����Ϣ
			System.out.println("�÷�����ע��Ϊ:<num.> "+tst.num()+"<price.> "+tst.price());
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		System.out.println("�����еķ����У�");
		for(Method m:math){
			System.out.println(m.getName());
			
		}
	}

}
