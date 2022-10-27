package org.narrowingWindeningEx;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int a = 100;
		float f = a;    //implicit widening
		System.out.println("a = "+a);
		System.out.println("f = "+f);
		
		byte b = 100;
		double d = b;    //implicit widening
		System.out.println("b = "+b);
		System.out.println("d = "+d);
		
		short x = 90;
		long k = x;      //implicit widening
		System.out.println("x = "+x);
		System.out.println("k = "+k);
		
		System.out.println("**Program Ends**");
	}
}
