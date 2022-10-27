package org.methodEx;

public class ReturnTypeEx1 {

	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ReturnTypeEx1 obj1 = new ReturnTypeEx1();
		obj1.addition(10,20);
		//	System.out.println("sum = "+sum);
		System.out.println("**Program Ends**");
	}
	public int addition(int a, int b) {
		int sum = a+b;
		System.out.println("sum = "+sum);
	//	return 30;
	//	return sum;
		return a+b ;
		//System.out.println("Hello");
	}
}