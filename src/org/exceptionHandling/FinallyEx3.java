package org.exceptionHandling;

import java.util.Scanner;

import org.scannerClass.Ex2;

public class FinallyEx3 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		FinallyEx3 obj = new FinallyEx3();
		obj.division(10,0);
		System.out.println("** Program Ends **");	
	}
	public void division(int a, int b) {
		System.out.println("** Division Starts **");
		int div = 0;
		try {
			System.out.println(" Try 1");
			div = a/b;
			System.out.println(" Try 2");
		} finally {
			System.out.println("** Finally Executing.... **");
		}
		System.out.println("division = "+ div);	
		System.out.println("** Division Ends **");		
	}
}
//catch(ArithmeticException obj) {
//	System.out.println("** catch 1 **");
//	obj.printStackTrace();
//	System.out.println("** catch 2 **");
//}