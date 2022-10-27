package org.methodEx;

public class ReturnTypeEx2 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ReturnTypeEx2 obj1 = new ReturnTypeEx2();
		
		int sum = obj1.addition(10, 20);
		System.out.println("sum = "+sum);
		System.out.println("**Program Ends**");
	}
	public int addition(int a, int b) {
		int sum=a+b;
		System.out.println("sum = "+sum);
		return a+b;
	}
}


