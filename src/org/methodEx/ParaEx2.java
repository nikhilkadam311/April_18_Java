package org.methodEx;

public class ParaEx2 {
	public void test1(int a, int b) {
		System.out.println("Test 1-int,int");
	}
	public void test2(int c) {
		System.out.println("Test 2-int");
	}
	public void test3(char ch, boolean flag,float a, byte b) {
		System.out.println("Test 3-char,boolean,float,byte");
	}
	public void test4(float a, byte b,double d) {
		System.out.println("Test 4-float,byte,double");
	}
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ParaEx2 obj1 = new ParaEx2();
		obj1.test1(10, 20);
		obj1.test2(55);
		obj1.test3('r', true, 55.44f, (byte)10);
		System.out.println("**Program Ends**");
	}
}