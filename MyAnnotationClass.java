package ua.i.hatebreeder;

public class MyAnnotationClass {
		
	@MyAnnotation(first = 5, second = 15)
	public int calculateSum(int a, int b) {
		int result = a + b;
		return result;
	}
	public int multiply(int a, int b){
		int result = a*b;
		return result;
	}
}
