//*******************NESTED FOR*************************//
package org.loops.Ex1;
public class NestedForEx {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		for (int i=1 ; i>=4; i++) {
			for (int j=9 ; j>=4; j--) {
				System.out.print(j+" ");	
			}
			System.out.println( );
		}
		System.out.println("**Program Ends**");
	}
}


