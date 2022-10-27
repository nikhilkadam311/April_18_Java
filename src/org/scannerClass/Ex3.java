package org.scannerClass;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Name : ");		
			String name = scn.next();
	//	String name = scn.nextLine();
		System.out.println("Entered name is : "+name);
		System.out.println("** Program Ends **");		
	}
}
