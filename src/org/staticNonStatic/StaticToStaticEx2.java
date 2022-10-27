package org.staticNonStatic;

class Ex2 {
	static int x=50,y=60;    //static Method
	public static void test3() {   //static method
		System.out.println("Test 3");

	}
	public static void test4() {   //static method
		System.out.println("Test 4");
	}	
}
public class StaticToStaticEx2 {
	public static void main(String[] args)    //static method
	{  System.out.println("** Programs Starts **");
	
	//way 1;
//	System.out.println("x = "+x);   //Error  direct calling 
//	System.out.println("y = "+y);    // not allow their name
//	test3();
//	test4();
	System.out.println("************************");
	//way 2; 
	System.out.println("Ex2.x = "+Ex2.x);   //Recommended using class Name
	System.out.println("Ex2.y = "+Ex2.y);    //
	Ex2.test3();
	Ex2.test4();
	System.out.println("************************");
	//way 3;
	Ex2 obj= new Ex2();
	System.out.println("obj.x = "+obj.x);  //Not Recommended using object of class
	System.out.println("obj.y = "+obj.y);  //  
	obj.test3();
	obj.test4();
	System.out.println("************************");
	}	
} 