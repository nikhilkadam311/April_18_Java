package org.constructorPractice;
// We can initialize the global variable of class by using constructor.
// we can write multiple constructor in one class
public class Ex3 {
	char x;
	float f;
	double d;
	boolean flag;
	public Ex3() {//default
		System.out.println("Default Con");
		return; //by default hidden
	}
	public Ex3(char ch) {
		x = ch;
		System.out.println("Para Con- char");
	}
	public Ex3(float a,double b,boolean flag) {
		f = a;
		this.d = d;
		this.flag = flag;
		System.out.println("Para Con- float,double,boolean");
	}
	
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		Ex3 obj3 = new Ex3('R');
		Ex3 obj4 = new Ex3(10,20,true);
		System.out.println("obj3.x = "+obj3.x);          //R
		System.out.println("obj4.x = "+obj4.x); 
		System.out.println("obj4.f = "+obj4.f);
		System.out.println("obj4.d = "+obj4.d);
		System.out.println("obj4.flag = "+obj4.flag);
		System.out.println("** Programs Ends **");
	}
}