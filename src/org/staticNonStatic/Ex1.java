package org.staticNonStatic;

public class Ex1 {
	int a=50,b=60;             //non-static variables
	static int x=10,y=20;      //static variables
	public static void main(String[] args) {  ////static method
		System.out.println("*** Program Starts ***");
		Ex1 obj = new Ex1 ();
		System.out.println("*** Program Ends ***");


	}
	public static void test3()  {    // static method
		System.out.println("Test 3");
	}
	public static void test4()  {    // static method
		System.out.println("Test 4");
		}
	public  void test1()  {    // non-static method
		System.out.println("Test 1");
	}
	public  void test2()  {    // non-static method
		System.out.println("Test 2");
	}

}
