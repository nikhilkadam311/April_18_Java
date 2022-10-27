package org.staticNonStatic;

public class NonStaticToNonStaticEx {
	int a=10,b=20;             //non-static variables
	public void main(String[] args) {  //static Main method
		System.out.println("*** Program Starts ***");
		NonStaticToNonStaticEx obj1 = new NonStaticToNonStaticEx ();
		obj1.a=500;
		obj1.b=600;
		obj1.test1();
		System.out.println("*** Program Ends ***");

	}

	public  void test1()  {    // non-static method
		System.out.println("Test 1:Starts");
		System.out.println("way 1 : direct by name");
		System.out.println("Test 1");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		test2();
		System.out.println("way 2 : by creating object");
		NonStaticToNonStaticEx obj2 = new NonStaticToNonStaticEx();
		System.out.println("obj2.a = "+obj2.a);
		System.out.println("obj2.b = "+obj2.b);
		obj2.test2();

		System.out.println("way 3 : by using this keyword");
		System.out.println("this.a = "+this.a);
		System.out.println("this.b = "+this.b);
		this.test2();
		System.out.println("Test 1 : Ends");
	}
	public  void test2()  {    // non-static method
		System.out.println("Test 2");
	}
}
