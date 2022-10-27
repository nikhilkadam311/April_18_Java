package org.exceptionHandling;

public class NoFinallyExecuteEx {
	public static void main(String[] args) {
//		System.exit(0);
		System.out.println("** Program Starts **");
		int div = 0;
		try {
			System.out.println(" Try 1");
			div = 10/2;
//			System.exit(0);
			System.out.println(" Try 2");
		}catch(ArithmeticException obj) {
			System.out.println("** catch 1 **");
			obj.printStackTrace();
			System.out.println("** catch 2 **");
		} finally {
			System.out.println("** Finally Starts **");
//			System.exit(0);
			String str = "Pune";
			System.out.println(str.charAt(4));
			System.out.println("** Finally Ends **");
		}
		System.out.println("division = "+ div);	
//		System.exit(0);
		System.out.println("** Program Ends **");		
	}
}