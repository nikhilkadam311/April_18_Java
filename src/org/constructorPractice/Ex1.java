package org.constructorPractice;

public class Ex1 {
public Ex1() {                //Default Constructor Print first
	System.out.println("Default Constructor");
}
	public static void main(String[] args) {
		System.out.println("**Programs Starts");
		Ex1 obj = new Ex1();
		System.out.println("**Programs Ends");
	}
}