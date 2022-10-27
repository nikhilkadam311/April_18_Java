package org.wrapperClassEx;

public class StringToIntViceVersa {
	public static void main(String[] args) {
		String str = "500";
		//way 1:
		//step 1.String -> Integer      //wrapper class
		//step 2.Integer -> int         //primitive
		Integer obj = Integer.valueOf(str);
		int a =obj.intValue();
		System.out.println("str = "+str);
		System.out.println("a = "+a);
		System.out.println(str+251);
		System.out.println(a+251);
		//--------------------------------------

		//way 2:
		int b =obj.intValue();
		System.out.println("str = "+str);
		System.out.println("b = "+b);
		System.out.println(str+251);
		System.out.println(b+251);
	}
}
