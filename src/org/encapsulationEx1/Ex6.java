package org.encapsulationEx1;

class Parent4 {
	private int a,b;                   
	public int getA() {       
		return a;
	}
	public int getB() {                
		return b;
	}
	public void setA(int x) {       //setter method
		a = x;
	}
	public void setB(int y) {       //setter method
		b = y;
	}
}
public class Ex6 
{
	public static void main(String[] args) 
	{
		System.out.println("**** Programs Starts ");
		Parent4 obj1 = new Parent4() ;
		System.out.println("obj1.a= "+obj1.getA());         // 0
		System.out.println("obj1.b= "+obj1.getB());         // 0
		obj1.setA(50);
		obj1.setB(60);
		System.out.println("obj1.a= "+obj1.getA());         // 50
		System.out.println("obj1.b= "+obj1.getB());         // 60
		System.out.println("*****************");
		Parent4 obj2 = new Parent4() ;
		System.out.println("obj2.a= "+obj2.getA());         // 0
		System.out.println("obj2.b= "+obj2.getB());         // 0
		obj2.setA(10);
		obj2.setB(20);
		System.out.println("obj2.a= "+obj2.getA());         // 10
		System.out.println("obj2.b= "+obj2.getB());         // 20
		System.out.println("*****************");
		
		System.out.println("**** Programs Ends ");
	}
}