package org.interfaceEx;

interface Interf1 {
	public int addition(int a,int b);
	public int subtraction(int a,int b);
	public int multiplication(int a,int b);
	public int division(int a,int b);
}
public interface Ex4 {
	public static void main(String [] args) {
//		Interf1 obj =new Interf1();        //error
		Interf1 obj1 =new Interf1() {
			public int addition(int a,int b) {
				return a+b;
			}
			public int subtraction(int a,int b){
				return a-b;
			}
			public int multiplication(int a,int b){
				return a*b;
			}
			public int division(int a,int b){
				return a/b;
			}
			
		}; 
		System.out.println("sum "+obj1.addition(10,20));
		System.out.println("sub "+obj1.subtraction(10,20));
		System.out.println("mul "+obj1.multiplication(10,20));
		System.out.println("div "+obj1.division(10,20));
	}
}