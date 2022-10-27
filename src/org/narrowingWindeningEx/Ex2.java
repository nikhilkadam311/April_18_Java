package org.narrowingWindeningEx;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int a = 100;
		byte b = (byte)a;    //explicit narrowing
		System.out.println("a = "+a);
		System.out.println("b = "+b);


		double d = 987654321.44d ;
		int i = (int)d;  //explicit narrowing
		System.out.println(" d = "+d);
		System.out.println(" i = "+i);		

		System.out.println("**Program Ends**");
	}
}
