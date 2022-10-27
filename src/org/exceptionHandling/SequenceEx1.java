
package org.exceptionHandling;
public class SequenceEx1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");		
		try {
			System.out.println("** Division Starts **");
			int div = 10/0;
			System.out.println("division = "+div);
			System.out.println("** Array Starts **");
			int[] ar = {55,44,77,22,66};
			System.out.println(ar[3]);
			System.out.println("** String Starts **");
			String str = "Pune";
			System.out.println(str.charAt(4));
			System.out.println("** String Ends **");
		} /*catch(Throwable e) {
////			e.printStackTrace();
//		}*/ catch(StringIndexOutOfBoundsException obj) {
	System.out.println("** catch 1 **");
	obj.printStackTrace();
	System.out.println("** catch 2 **");
}catch(ArithmeticException obj) {
	System.out.println("** catch 3 **");
	obj.printStackTrace();
	System.out.println("** catch 4 **");
}catch(ArrayIndexOutOfBoundsException obj) {
	System.out.println("** catch 5 **");
	obj.printStackTrace();
	System.out.println("** catch 6 **");
}catch(Exception e) {
	e.printStackTrace();
}
		System.out.println("** Program Ends **");
	}
}