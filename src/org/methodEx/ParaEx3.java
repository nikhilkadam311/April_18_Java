package org.methodEx;

public class ParaEx3 {
	public void test5() {
		System.out.println("Test 5");
		this.test3('Q',true,7,(byte)25 );
	}
	public void test3(char ch, boolean flag,float x, byte y) {
		System.out.println("Test 3-char,boolean,float,byte");
		System.out.println("char ch = "+ch);
		System.out.println("boolean flag = "+flag);
		System.out.println("float = "+flag);
		System.out.println("byte y = "+y);
		test4(x,y,x);
		
	}
	public void test4(float a, byte b,double d) {
		System.out.println("Test 4-float,byte,double");
	}
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ParaEx3 obj1 = new ParaEx3();
		obj1.test5();
		System.out.println("**Program Ends**");
	}
}