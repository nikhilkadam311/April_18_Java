// By using 	Throw method
// compile time exception
//when we work on file use file class,file input stream class
package org.exceptionHandling;

import java.sql.SQLException;

public class ThrowEx1 {
	public static void main(String[] args)   {
		System.out.println("** Program Starts **");	   //type 1 - hard core path
		ThrowEx1 obj = new ThrowEx1();
		obj.division(10,0);
		System.out.println("** Program Ends **");
	}
	public void division(int a,int b) {//throws SQLException,ArithmeticException
		System.out.println("Division starts");
		int div = 0;	
		if (b != 0) {
			div = a/b;	
		}else {
			throw new ArithmeticException("Denominator should not be zero");
//		System.out.println();     //error unreachable code
//		throw new SQLException("abc");    //error 
		}
		System.out.println("division ="+div);
		System.out.println("** division Ends **");		
	}
	}