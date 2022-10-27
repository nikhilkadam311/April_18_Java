package org.staticNonStatic;
class Ex33 {
	static int x=50,y=60;    //static Method
	public static void test3() {   //static method
		System.out.println("Test 3");
	}
	public static void test4() {   //static method
		System.out.println("Test 4");
	}
}
public class NonStaticToStaticEx22 {
	public void test1() {   //non-static method
		System.out.println("Test 1");
		System.out.println("Ex33.x = "+Ex33.x);
		System.out.println("y = "+Ex33.y);
		Ex33.test3();        //NS -> S= Using class name.Static method
		Ex33.test4();
		return;   //by default hidden
	}
	public static void main(String[] args) {   //static main  method
		System.out.println("** Programs Starts **");
		NonStaticToStaticEx22 obj = new NonStaticToStaticEx22();
		obj.test1();
		obj.test2();
		System.out.println("** Programs Starts **");
	}
	
	public void test2() {   //non-static method
		System.out.println("Test 2");
		System.out.println("Ex33.x = "+Ex33.x);
		System.out.println("y = "+Ex33.y);
		Ex33.test3();
		Ex33.test4();
	}
}