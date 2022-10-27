package org.abstraction;

abstract class Parent2 { //abstract class
	abstract public  int addition (int a,int b);
	abstract public int substract (int a,int b);
	public static int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
	}
}
abstract public class Ex3 extends Parent2 {    // extends Parent2 ....then add abstract keyword.
//	abstract public  int addition (int a,int b);
//	abstract public int substract (int a,int b);
//	public static int multiplication (int a,int b) {
//		return a*b ;
//	}
//	public int division (int a,int b){
//		return a/b ;
//	}
public static void main(String[] args) {
	System.out.println("hellow");
}
}