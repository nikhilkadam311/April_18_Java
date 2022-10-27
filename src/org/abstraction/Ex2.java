package org.abstraction;

abstract public class Ex2 {

	public static void main(String[] args) {
		System.out.println("hellow");

	}
}
abstract class Parent {  //abstract keyword for the Class
	abstract public  int addition (int a,int b);
	abstract public int substract (int a,int b);
	public static int multiplication (int a,int b) {
			return a*b ;
	}
	public int division (int a,int b){
			return a/b ;
}
	}