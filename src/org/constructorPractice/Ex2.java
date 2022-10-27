package org.constructorPractice;

public class Ex2 {
	public Ex2() {//default
		System.out.println("Default Con");
		return; //by default hidden
	}
	public Ex2(int a) {//Para Con
		System.out.println("Para Con- int");
	}
	public Ex2(char ch) {//Para Con
		System.out.println("Para Con- char");
	}
	public Ex2(float a,double b,boolean flag) {//Para Con
		System.out.println("Para Con- float,double,boolean");
	}
	
	public static void main(String[] args) {
		System.out.println("**Programs Starts");
		Ex2 obj1 = new Ex2();
		Ex2 obj2 = new Ex2(50);
		Ex2 obj3 = new Ex2('R');
		Ex2 obj4 = new Ex2(10,20,true);
		
		System.out.println("**Programs Ends");
	}
}