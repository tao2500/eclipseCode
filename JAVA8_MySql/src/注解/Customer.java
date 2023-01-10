package 注解;

import java.lang.reflect.Method;


public class Customer {
	@Teest(num=1,price=23.5)
	public void buy(){
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Customer cm = new Customer();
		Class c = cm.getClass();
		Method[] math = c.getMethods();
//		Teest tes = Customer.class.getAnnotation(Teest.class);  //获取类注解信息
		try {
			Method mth = Customer.class.getMethod("buy");
			Teest tst = mth.getAnnotation(Teest.class);  //获取方法的注解信息
			System.out.println("该方法的注解为:<num.> "+tst.num()+"<price.> "+tst.price());
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		System.out.println("该类中的方法有：");
		for(Method m:math){
			System.out.println(m.getName());
			
		}
	}

}
