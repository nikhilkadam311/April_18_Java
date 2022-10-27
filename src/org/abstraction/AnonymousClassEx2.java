//abstract method to complete method....remove abstract word and 
//change un-implement method to implement method (by overridding)
//create anonymous object for abstract class

package org.abstraction;

abstract class Parent5 { //abstract class
	public Parent5() {              // create parent4 method
		System.out.println("**Parent 5 constructor");
	}
	public int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
	}
}
public class AnonymousClassEx2 {    //abstract method to complete method by method overridding
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");

//			Parent5 obj = new Parent5(); //error
		Parent5 obj = new Parent5() {  };//create anonymous object for abstract class
		
		System.out.println(obj.multiplication(10,20));
		System.out.println(obj.division(10,20));
		System.out.println("** Programs Ends ");
	}
}