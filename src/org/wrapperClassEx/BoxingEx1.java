package org.wrapperClassEx;

public class BoxingEx1 {

	public static void main(String[] args) {
	int a=10;
	Integer aObj1 = new Integer(10);         //java 1.8 feature
	Integer aObj2 = new Integer(a);          //java 1.8 feature
	//auto-boxing
	Integer aObj3 =10; 
	Integer aObj4 =a; 
	
	System.out.println("a = "+a);
	System.out.println("aObj2 = "+aObj2);
	System.out.println("aObj4 = "+aObj4);
	}
}
