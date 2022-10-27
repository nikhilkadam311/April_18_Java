//*******************78---94*************************//

package org.loops.Ex1;

import org.basicProgram.Ex4;

public class Ex7 {
	public void incremental (int i) {
		for ( ; i<=94;i++) 
			System.out.println("i="+i);
	}
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		Ex4 obj1 = new Ex4();
		obj1.incremental(78);	
		System.out.println("**Program Ends**");
	}
}