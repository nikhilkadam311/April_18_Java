//****************************Normal cont *****************************//
package org.basicProgram;
public class BreakFor1 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++)	
			if (i==2 && j==2) {
				break;
				}
			System.out.println(+i);
			System.out.println('j');
		}	
		System.out.println("**Program Ends**");
	}
	}
 