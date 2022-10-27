package org.assignment;

public class SystemEx2 { 
	// global static object
	public static SystemEx2 obj1 = new SystemEx2();
	
	int a=10,b=20;
	public void testMethod() { 
		System.out.println("Test Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Program Start");
		SystemEx2.obj1.testMethod();
		SystemEx2.test1();
		SystemEx2.test2();
		System.out.println("Program Ends");
	}
	public static void test1() { 
		SystemEx2.obj1.testMethod();
	}
	public static void test2() { 
		SystemEx2.obj1.testMethod();
	}
}
