package org.variablesEx;

public class GlobalVariablesEx1 {
	public byte b = 10;
	short s = 88;
	int a = -40;
	long k = 777;
	float f1 = 55.44f;
	double d1 = 44.10;
	double d2 = 99.44d;
	char c = 'k';
	boolean flag = true;

	public static void main(String[]args){
		System.out.println("**Program Starts**");
		GlobalVariablesEx1 obj = new GlobalVariablesEx1 ();
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