//**********n-d***********************
package org.loops.Ex1;
import org.basicProgram.Ex4;
public class Ex5 {
	public void smalldecrement (char ch) {
		for (  ; ch>='d';ch--)
			System.out.println("ch= "+ch);
	}
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		Ex4 obj1 = new Ex4();
		obj1.smalldecrement('n');
		System.out.println("**Program Ends**");
	}
}