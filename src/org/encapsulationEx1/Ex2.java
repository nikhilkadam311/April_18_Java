package org.encapsulationEx1;

class Parent3 {
	private int a=10,b=20;                   
	public int getA() {       
		return a;
	}
	public int getB() {                
		return b;
	}
 }
public class Ex2 
 {
	public static void main(String[] args) 
	{
		System.out.println("**** Programs Starts ");
		Parent3 obj = new Parent3() ;
		int a =obj.getA();
		int b =obj.getB();
		int sum =a+b;
	//	int sum = obj.getA()+obj.getB();
		System.out.println("sum = "+sum);
		
		System.out.println(obj.getA());         
		System.out.println(obj.getB());  
		System.out.println("**** Programs Ends ");
	}
 }