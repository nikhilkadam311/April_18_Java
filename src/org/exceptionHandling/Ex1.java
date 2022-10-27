package org.exceptionHandling;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		Ex1 obj = new Ex1();
		obj.division(10,0);
		System.out.println("** Program Ends **");
	}
	public void division(int a, int b) {
		System.out.println("** Division Starts **");
		int div =0;
		if(b != 0) {
			div = a/b;
		}
		System.out.println("division = "+ div);
		System.out.println("** Division Ends **");
	}
}