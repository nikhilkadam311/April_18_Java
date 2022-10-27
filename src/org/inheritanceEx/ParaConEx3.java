package org.inheritanceEx;          

class A1{             //class Parent6 extends Object -default hidden
	public A1(int a) { // if u add parametric constuctor so error occure.
		System.out.println(" A1-int ");
	}
	public A1(char ch,boolean flag) {
		this(ch);
		System.out.println(" A1-char,boolean ");
	}
	public A1(double d1,float x,short s) {
		this('R',true);
		System.out.println(" A1-double,float,short ");
	}
}
class B1 extends A1 {
	public B1(char ch,boolean flag) { 
		super(ch,flag);
		System.out.println(" B1-char,boolean ");
	}
	public B1(int a,double b,char ch) { 
		super(b,10f,(short)a);
		System.out.println(" B1-int,double,char ");
	}
	public B1(int a) { 
		this(10,22.11f,'R');
		System.out.println(" B1-int ");
}
}
public class ParaConEx3 extends B1 {
	public ParaConEx3(int a,int b) {             // create constructor
		super('W',false);
		System.out.println("Default ParaConEx3");
	}
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		ParaConEx3 obj1 = new ParaConEx3(90,100);
		
		System.out.println("** Programs Ends ");
	}
}
