package org.exceptionHandling;

import java.util.Scanner;

import org.scannerClass.Ex2;

public class FinallyReturnEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		FinallyReturnEx obj = new FinallyReturnEx();
		obj.division(10,2);
		System.out.println("** Program Ends **");	
	}
	public int division(int a, int b) {
		System.out.println("** Division Starts **");
		int div = 0;
		try {
			System.out.println(" Try 1");
			div = a/b;
			return div;
//			System.out.println(" Try 2");
		}catch(ArithmeticException obj) {
			System.out.println("** catch 1 **");
			obj.printStackTrace();
			System.out.println("** catch 2 **");
		} finally {
			System.out.println("** Finally Executing.... **");
		}
		System.out.println("division = "+ div);	
		System.out.println("** Division Ends **");	
		return div;
	}
}
