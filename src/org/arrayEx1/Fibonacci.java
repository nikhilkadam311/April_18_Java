//fibonacci series no. first 1 to 10;
package org.arrayEx1;

public class Fibonacci {
	static int a=0,b=1,c;
	
	public static void main(String[] args) {	
		System.out.println(a+" "+b);
		Fibonacci obj=new Fibonacci();
		obj.printfib(10);
	}
	void printfib(int i) {
			if(i>=1) {
				c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			printfib(i-1);
		}
	}
}