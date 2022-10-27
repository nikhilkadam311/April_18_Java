package org.staticNonStatic;

public class StaticToNonStaticEx {
	int a=50,b=60;             //non-static variables
	public static void main(String[] args) {  ////static method
		System.out.println("*** Program Starts ***");
		StaticToNonStaticEx obj = new StaticToNonStaticEx ();
		System.out.println("a = "+obj.a);     //obj require
		System.out.println("b = "+obj.b);
		System.out.println(obj.a);
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("*** Program Ends ***");
	}
	public  void test1()  {    // non-static method
		System.out.println("Test 1");
	}
	
	public  void test2()  {    // non-static method
		System.out.println("Test 2");
	}
	// We didn't call test3() from main()
	public static void test3()  {    // static method
		System.out.println("Test 3");
		StaticToNonStaticEx obj = new StaticToNonStaticEx ();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		obj.test1();
		obj.test2();
	}
	// We didn't call test4() from main()
	public static void test4()  {    // static method
		System.out.println("Test 4");
		StaticToNonStaticEx obj = new StaticToNonStaticEx ();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		obj.test1();
		obj.test2();
}
}
