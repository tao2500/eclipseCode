package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;
	@ Target({ElementType.FIELD,ElementType.METHOD})
	@ Retention(RetentionPolicy.RUNTIME)  //规定存活时间
	public @interface Teest {
		int num() default 0;
		double price() default 10.5; 
	}

