//abstract method to complete method....remove abstract word and 
//change un-implement method to implement method (by overridding)
//create anonymous object for abstract method
package org.abstraction;

abstract class Parent4 { //abstract class
	public Parent4() {              // create parent4 method
		System.out.println("**Parent 4 constructor");
	}
	abstract public  int addition (int a,int b);
	abstract public int subtraction (int a,int b);
	public int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
	}
}
public class AnonymousClassEx1 {    //abstract method to complete method by method overridding
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");

//			Parent4 obj = new Parent4(); for
		Parent4 obj = new Parent4() {   //create anonymous object for abstract method
			public  int addition (int a,int b) { // abstract to complete method
				return a+b;                      // override but self write  
			}
			public int subtraction (int a,int b) { // abstract to complete method
				return a-b;                      // override but self write  
			}
//			public int multiplication (int a,int b) {   // override
//				return a*b ;
//			}
//			public int division (int a,int b){          // override
//				return a/b ;
//			}
		};
		System.out.println(obj.addition(10,20));
		System.out.println(obj.subtraction(10,20));
		System.out.println(obj.multiplication(10,20));
		System.out.println(obj.division(10,20));
		System.out.println("** Programs Ends ");
	}
}