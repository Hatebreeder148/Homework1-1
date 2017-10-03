package ua.i.hatebreeder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyAnnotationClass mac = new MyAnnotationClass();
		Class<?> classOne = mac.getClass();
		Method[] methods = classOne.getMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(MyAnnotation.class)){
				MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
				System.out.println(method.invoke(mac, ma.first(), ma.second()));
//				int result = (int) method.invoke(mac, ma.first(), ma.second());
//				System.out.println(result);
			}
		}
		
		

	}

}
