package org.constructorPractice;

public class OnlyParaEx {
	public OnlyParaEx(int a) {//Para Con
		System.out.println("Para Con- int");
	}
	public OnlyParaEx(char ch) {//Para Con
		System.out.println("Para Con- char");
	}
	public OnlyParaEx(float a,double b,boolean flag) {//Para Con
		System.out.println("Para Con- float,double,boolean");
	}
	
	public static void main(String[] args) {
		System.out.println("**Programs Starts");
//		OnlyParaEx obj1 = new OnlyParaEx();  // Error
		OnlyParaEx obj2 = new OnlyParaEx(50);
		OnlyParaEx obj3 = new OnlyParaEx('R');
		OnlyParaEx obj4 = new OnlyParaEx(10,20,true);
		
		System.out.println("**Programs Ends");
	}
}