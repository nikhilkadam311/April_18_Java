//variable inside interface are by default static and final.
//final keyword is used to defined constant in Java.
//Constants are defined by capital letter.
// we can't change value of constants.

package org.interfaceEx;

interface Interf8 {
//	int a;            //Error
	int a = 10;       // final and static
}
public class Ex8 {
//	final static int a = 10;       for reference
	public static void main(String [] args) {
		System.out.println(Interf8.a);
	}
}
	