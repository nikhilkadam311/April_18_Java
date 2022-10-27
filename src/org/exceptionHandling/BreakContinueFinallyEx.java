package org.exceptionHandling;

public class BreakContinueFinallyEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		try {
			System.out.println(" Try 1 ");
			for(int i=1;i<=10; i++) {
				if(i==5) {
					//break;
					continue;
				}
				System.out.println("i = "+i);
			}
			System.out.println(" Try 2 ");
		} catch(Exception e) {
			System.out.println("Catch Block....");
			e.printStackTrace();
		}finally {
			System.out.println("** Finally executing **");
		}
		System.out.println("** Program Ends **");	
	}
}