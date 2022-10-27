//****************************BREAK *****************************//
package org.loops.Ex1;
public class BreakFor2 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		for (int i=1; i<=10;i++) {
			if (i==5) 
				continue;
			System.out.println(i);
		}	
		System.out.println("**Program Ends**");
	}
}