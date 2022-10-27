package org.staticNonStatic;

public class MultipleCopiessEx {
	int a=10,b=20;             //non-static variables
	public static void main(String[] args) {  ////static method
		System.out.println("*** Program Starts ***");
		MultipleCopiessEx obj1 = new MultipleCopiessEx ();
		MultipleCopiessEx obj2 = new MultipleCopiessEx ();
		System.out.println("obj1.a = "+obj1.a);    //10 
		System.out.println("obj1.b = "+obj2.b);    //20
		obj1.a=500;
		obj1.b=600;	
		System.out.println("obj1.a = "+obj1.a);    //500
		System.out.println("obj1.b = "+obj1.b);    //600
		//-----------------------------------------
		System.out.println("obj2.a = "+obj2.a) ;  //10 
		System.out.println("obj2.b = "+obj2.b) ; //20
		System.out.println("*** Program Ends ***");
	}
}
