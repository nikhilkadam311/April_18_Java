package org.encapsulationEx1;

class Parent2 
 {
	private int a=10,b=20;                   
	public void test3() 
	{                
		System.out.println("a = "+a);
	}
	public void test4() 
	{                
		System.out.println("b = "+b);
	}
 }

public class Ex3 
 {
	public static void main(String[] args) 
	{
		System.out.println("**** Programs Starts ");
		Parent2 obj = new Parent2() ;
		obj.test3();         
		obj.test4(); 
		System.out.println("**** Programs Ends ");
	}
 }