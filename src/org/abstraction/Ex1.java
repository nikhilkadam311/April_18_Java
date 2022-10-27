package org.abstraction;

abstract public class Ex1 {

	public static void main(String[] args) {
		System.out.println("hellow");
	}
	
}
abstract class A {                  //abstract keyword for the Class 
	abstract protected void test1();   //static keyword-get error
	abstract public void test2();   //public ,protected allow only
}
abstract class B {
	abstract public int addition (int a,int b);
	public int substract (int a,int b) {
		return a-b;
	}
}
abstract class C {
	public int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
}
}