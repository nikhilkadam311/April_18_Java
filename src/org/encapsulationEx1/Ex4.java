package org.encapsulationEx1;
//practice 
class Parent5 
{
	private int a=10,b=20;      //private variable not call in main method directly**                   
	public int test3()          //we can call private variable though sub-Public method to in main method
	{                
		return a;
	}
	public int test4()          //we can call private variable though sub-Public method to in main method
	{                
		return b;
	}
}

public class Ex4 
{
	public static void main(String[] args) 
	{
		System.out.println("**** Programs Starts ");
		Parent5 obj = new Parent5() ;
		System.out.println(obj.test3());         
		System.out.println(obj.test4()); 

		System.out.println("a = "+obj.test3() ); 
		System.out.println("b = "+obj.test4() ); 
		
		System.out.println("**** Programs Ends ");
	}
}