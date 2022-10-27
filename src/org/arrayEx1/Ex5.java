//By using 3rd variable Swapping Of 2 Number
package org.arrayEx1;

public class Ex5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp = 10;
		a = b;
		b = temp ;				
		System.out.println();     //space
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}