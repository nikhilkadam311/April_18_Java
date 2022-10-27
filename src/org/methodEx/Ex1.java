package org.methodEx;

public class Ex1 {
	int a = 10;
	public static void test () {//Required 1 statement use again an again 
		System.out.println("Hello");
		System.out.println("Good Evening");
		System.out.println("Welcome");
		//return; // by default hidden	
	}
	public static void main(String[] args) {
		System.out.println("Programs Starts");
		Ex1 obj = new Ex1();
		obj.test();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		obj.test();
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		obj.test();
		
		System.out.println("Programs Ends");
	}
}
