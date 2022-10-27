package org.finalKeyword;

public class Ex1 {
	final int a=50;
	final static float b=55.44f;
	public static void main(String [] args) {
		Ex1 obj1 = new Ex1();
		System.out.println("obj1.a = "+obj1.a);
		System.out.println("Ex1.b = "+Ex1.b);
//		obj1.a = 500;            //final data not change
//		Ex1.b = 55.44f;          //final data not change
	}
}
