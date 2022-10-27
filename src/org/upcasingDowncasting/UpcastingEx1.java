package org.upcasingDowncasting;

class A2 {
	public void test1() {
		System.out.println("A2 - test1");
	}
}
class B2 extends A2 {
	public void test2() {
		System.out.println("B2 - test2");
	}
}
class C2 extends B2 {
	public void test3() {
		System.out.println("C2 - test3");
	}
}
public class UpcastingEx1 {
	public static void main(String[] args) {
		A2 a = new C2();  //explicit up-casting
		a.test1();
//		a.test2();     //error
//		a.test3();     //error
		System.out.println();

		B2 b = (B2)a;  //explicit down-casting
		b.test1();
		b.test2();
//		b.test3();     //error
		System.out.println();

		C2 c = (C2)a;  //explicit down-casting
		c.test1();
		c.test2();
		c.test3();
		System.out.println();

	}
}