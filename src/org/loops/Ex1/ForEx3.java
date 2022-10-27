//******************************TABLE**************************************
package org.loops.Ex1;
public class ForEx3 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		for (int a=11,b=21,c=51 ; (a<=13 && b<=23 && c<=53) ; a++,b--,c++) {
			System.out.println(a+", "+b+", "+c);
		}	
		System.out.println("**Program Ends**");
	}
}