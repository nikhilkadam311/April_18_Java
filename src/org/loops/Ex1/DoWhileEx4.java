//****************************DO WHILE LOOP*****************************//
package org.loops.Ex1;
public class DoWhileEx4 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int a=10;
		while (a<5) 
		System.out.println(a);{
			System.out.println(a);
		}
		System.out.println("after while a = "+a);
		System.out.println("*************");
		int i=10;
		do	{
			System.out.println(i);
			i++;
		} while (i<5);
		System.out.println("after do-while i = "+i);
		System.out.println("**Program Ends**");
	}
}