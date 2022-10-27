package org.scannerClass;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a : ");		
		int a = scn.nextInt();
		System.out.println("Enter b : ");
		int b = scn.nextInt();
		Ex2 obj = new Ex2();
		obj.addition(a,b);
		System.out.println("** Program Ends **");		
	}
public void addition(int a,int b) {
	System.out.println("sum = "+(a+b));
}
}
	