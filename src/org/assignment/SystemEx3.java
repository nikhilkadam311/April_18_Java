package org.assignment;
class Parent2 {
	int a=10,b=20;
	public void testMethod() { 
		System.out.println("Test Method");
	}
}
public class SystemEx3 { 
	// global static object-
	
	public static void main(String[] args) {
		System.out.println("*** Program Start ***");
		Parent2 obj1 = new Parent2();
		obj1.testMethod();
		SystemEx3.test1();
		SystemEx3.test2();
		System.out.println("*** Program Ends ***");
	}
	public static void test1() { 
		Parent2 obj1 = new Parent2();
		obj1.testMethod();
	}
	public static void test2() { 
		Parent2 obj1 = new Parent2();
		obj1.testMethod();
	}
}
