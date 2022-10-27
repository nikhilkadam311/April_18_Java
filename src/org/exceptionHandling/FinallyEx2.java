package org.exceptionHandling;

import java.util.Scanner;

import org.scannerClass.Ex2;

public class FinallyEx2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		FinallyEx2 obj = new FinallyEx2();
		obj.division(10,2);
		System.out.println("** Program Ends **");	
	}
	public void division(int a, int b) {
		System.out.println("** Division Starts **");
		int div = 0;
		try {
			System.out.println(" Try 1");
			div = a/b;
			System.out.println(" Try 2");
		}catch(ArithmeticException obj) {
			System.out.println("** catch 1 **");
			obj.printStackTrace();
			System.out.println("** catch 2 **");
		} finally {
			System.out.println("** Finally Executing.... **");
		}
		System.out.println("division = "+ div);	
		System.out.println("** Division Ends **");		
	}
}
