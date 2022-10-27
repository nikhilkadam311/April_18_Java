package org.exceptionHandling;

public class TryCatchNestingEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		try {
			System.out.println("** Try 1 **");
			try {
				System.out.println("** Try 2 **");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("** catch 1 **");
				e.printStackTrace();
			}
		}catch(ArithmeticException e) {
			System.out.println("** catch 2 **");
			e.printStackTrace();
			try {
				System.out.println("** Try 3 **");
			}catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("** catch 1 **");
				e2.printStackTrace();
			}
		}
		System.out.println("** Program Ends **");
	}
}