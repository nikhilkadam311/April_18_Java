package org.exceptionHandling;

import java.util.Scanner;

import org.scannerClass.Ex2;

public class FinallyEx1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a : ");	
		try {
			int a = scn.nextInt();
			scn.close();
			System.out.println("Entered a : "+a);
		}catch(Exception e) {
			scn.close();
			e.printStackTrace();
			int division = 10/0;
			System.out.println("division : "+division);
		} finally {
			System.out.println("** Finally Executing.... **");
			scn.close();
		}
		scn.close();
		System.out.println("** Program Ends **");		
	}
}
