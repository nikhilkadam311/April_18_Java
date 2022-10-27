package org.constructorPractice;

public class ThisEx1 {
	public ThisEx1() {//default
		System.out.println("Default Con");
		return; //by default hidden
	}
	public ThisEx1(int a) {
	this();
		System.out.println("Para Con- int");
	}
	public ThisEx1(char ch,byte b) {
		this(3.5f,88.7f,true); //this()statement should be the first statement of constructor
		System.out.println("Para Con- char");
//		this(3.5f,88.7f,true); 
	}
	public ThisEx1(float a,double b,boolean flag) {
		this((int)a);
		System.out.println("Para Con- float,double,boolean");
	}
	public ThisEx1(double x,short y) {
		this(y);
			System.out.println("Para con- double- short") ;
	}
	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("**Programs Starts");
		ThisEx1 obj1 = new ThisEx1('Q',(byte)10);
		System.out.println();
		ThisEx1 obj2 = new ThisEx1(10,(short)20);
		System.out.println();
		ThisEx1 obj3 = new ThisEx1(50);
		System.out.println();
		ThisEx1 obj5 = new ThisEx1();
		System.out.println("**Programs Ends");
	}
}