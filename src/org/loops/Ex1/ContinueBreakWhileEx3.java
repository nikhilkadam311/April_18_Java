//****************************WHILE continue LOOP*****************************//
package org.loops.Ex1;
public class ContinueBreakWhileEx3 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int i=1;
		while (i<11){
			if (i==5) {
				i++;
				//continue;
				break;
			}
			System.out.println(i);
			i++;
			}
		System.out.println("i = "+i);
		System.out.println("**Program Ends**");
	}
}