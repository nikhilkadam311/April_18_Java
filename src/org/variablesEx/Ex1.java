package org.variablesEx;

public class Ex1 {
	public static void main(String[] args) {
	System.out.println("Programs Starts");
	int a=10;
	int b=20;
	int sum = a+b;
	System.out.println(a);        //("a") -> a,,(a) -> 20
	System.out.println("b");      //("b") -> b,,(b) -> 20
	System.out.println("sum");  
	System.out.print("a = ");     // print a_=_
	System.out.println(a);        // println 10
	System.out.print("b = ");
	System.out.println(b);
	System.out.print("sum = ");   //sum_=_
	System.out.println(sum);      //30
	
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("sum = "+sum);
	
	System.out.println("a = "+a); 
	System.out.println("b = "+b); 
	System.out.println("sum = "+sum);
	System.out.println("sum = "+a+b);
	System.out.println("sum = "+(a+b));
	
	
	//sum of 10 and 20 is 3
	System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		System.out.println("Programs Ends");
	}
}