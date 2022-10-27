package org.exceptionHandling;

public class SequenceEx2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		try {
			System.out.println("** Division Starts **");
			int div = 10/2;
			System.out.println("division = "+div);
			System.out.println("** Array Starts **");
			int[] ar = {55,44,77,22,66};
			System.out.println(ar[3]);
			System.out.println("** String Starts **");
			String str = "Pune";
			System.out.println(str.charAt(4));
			System.out.println("** String Ends **");
			//	}catch(Throwable e) {
			//		e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}catch (Error e) {      // not good practice
			e.printStackTrace();   	
		}
		System.out.println("** Program Ends **");
	}
}