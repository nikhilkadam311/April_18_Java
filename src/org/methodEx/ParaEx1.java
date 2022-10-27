package org.methodEx;

public class ParaEx1 {
public void addition(int a, int b) {
	int sum=a+b;
	System.out.println("sum = "+sum);
}
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ParaEx1 obj1 = new ParaEx1();
		obj1.addition(10,20);
		obj1.addition(50,60);
		obj1.addition(-70,-90);
		obj1.addition(55,99);
		System.out.println("**Program Ends**");
	}
}
