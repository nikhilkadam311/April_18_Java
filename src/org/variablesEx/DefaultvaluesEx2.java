package org.variablesEx;

public class DefaultvaluesEx2 {
	// global variable
	static byte b=10;
	short s;
	int a;
	long k;
	float f1;
	double d1;
	double d2;
	char c;
	boolean flag;
	
	public static void main(String[]args){
		System.out.println("**Program Starts**");
		DefaultvaluesEx2 obj = new DefaultvaluesEx2 ();
		System.out.println("byte b = "+obj.b);
		System.out.println("short s = "+obj.s);
		System.out.println("int a  = "+obj.a);
		System.out.println("long k = "+obj.k);
		System.out.println("float f1 = "+obj.f1);
		System.out.println("double d1 = "+obj.d1);
		System.out.println("double d2 = "+obj.d2);
		System.out.println("char c = "+obj.c);
		System.out.println("boolean flag = "+obj.flag);

		System.out.println("**Program Ends**");
	}
}