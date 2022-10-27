package org.basicProgram;

public class Ex4 {
	public void decrease (int i) {
		for ( ; i>=234;i--) 
			System.out.println("i="+i);
		}
	public void incremental (int i) {
			for ( ; i<=94;i++) 
				System.out.println("i="+i);
			}
	public void capitalSmall (char ch) {
				for ( ; ch<='z';ch++) 
					System.out.println("ch= "+ch);
			}
	public void capitaldecrement (char ch) {
					for (  ; ch<='Q';ch++)
					System.out.println("ch= "+ch);
			}
	public void smalldecrement (char ch) {
						for (  ; ch>='d';ch--)
					System.out.println("ch= "+ch);

			}
	public static void main(String[]args) {
					System.out.println("**Program Starts**");
							Ex4 obj1 = new Ex4();
//			obj1.decrease(265);
//			obj1.incremental(78);	
//			obj1.capitalSmall('A');
//			obj1.capitaldecrement('D');
			obj1.smalldecrement('n');
							
							System.out.println("**Program Ends**");
			
			}
			}