package org.exceptionHandling;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		Ex2 obj = new Ex2();
		obj.division(10,0);
		System.out.println("** Program Ends **");
	}
	public void division(int a, int b) {
		System.out.println("** Division Starts **");
		int div =0;
		try {
			System.out.println("** Try 1 **");
			div = a/b;
			System.out.println("** Try 2 **");
		} catch(ArithmeticException obj) {
			System.out.println("** catch 1 **");
			obj.printStackTrace();
			System.out.println("** catch 2 **");
				System.out.println(obj.getMessage());
		}
		System.out.println("division = "+ div);
		System.out.println("** Division Ends **");
	}
}