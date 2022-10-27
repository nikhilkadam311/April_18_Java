package org.upcasingDowncasting;

class A3 {
	public void test1() {
		System.out.println("A3 - test1");
	}
}
class B3 extends A3 {
	public void test1() {
		System.out.println("B3 - test2");
	}
}
class C3 extends B3 {
	public void test1() {
		System.out.println("C3 - test3");
	}
}
public class UpcastingEx2 {
	public static void main(String[] args) {
		C3 c = new C3();  
		c.test1();	         //C3-test1
		System.out.println("************");
		
		B3 b = (B3)c ;
		b.test1() ;            //C3-test1
		System.out.println("*************");

		A3 a = (A3)c ;
		a.test1();          //C3-test1
	}
}