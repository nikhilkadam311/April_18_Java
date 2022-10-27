package org.encapsulationEx1;
//practice 
class Parent9 {
	private int a=10,b=20;                   
	public int test3() {       
		return a;
	}
	public int test4() {                
		return b;
	}
 }
public class Ex5 
 {
	public static void main(String[] args) 
	{
		System.out.println("**** Programs Starts ");
		Parent9 obj = new Parent9() ;
		int a =obj.test3();
		int b =obj.test4();
		int sum =a+b;
	//	int sum = obj.test3()+obj.test4();
		System.out.println("sum = "+sum);
		
		System.out.println(obj.test3());         
		System.out.println(obj.test4());  
		System.out.println("**** Programs Ends ");
	}
 }