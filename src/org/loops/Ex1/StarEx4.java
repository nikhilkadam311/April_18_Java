//*******************NESTED FOR STAR*************************//
package org.loops.Ex1;
public class StarEx4 {
	public static void main(String[] args) {
		for (int i=1 ; i<=4; i++) {
			for (int j=i ; j<=4; j++) {
				System.out.print(" ");	
			}
			for (int k=1; k<=i; k++) {
				System.out.print(" "+i);
			}	
			System.out.println();
		}
	}
}
//*******************NESTED FOR STAR*************************//
/*package org.loops.Ex1;
public class StarEx {
	public static void main(String[] args) {
		for (int i=1 ; i<=4; i++) {
			for (int j=i ; j<=4; j++) {
				System.out.print(" ");	
			}
			for (int k=1; k<=i; k++) {
				System.out.print(" *");
			}	
			System.out.println();
		}
	}
}*/