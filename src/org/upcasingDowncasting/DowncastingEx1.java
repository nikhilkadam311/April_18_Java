package org.upcasingDowncasting;
class A1 {
	public void test1() {
		System.out.println("A1 - test1");
	}
}
class B1 extends A1 {
	public void test2() {
		System.out.println("B1 - test2");
	}
}
class C1 extends B1 {
	public void test3() {
		System.out.println("C1 - test3");
	}
}
public class DowncastingEx1 {
	public static void main(String[] args) {
		C1 c = new C1();  //explicit up-casting
		c.test1();
		c.test2();     
		c.test3();     
		System.out.println();

		B1 b = (B1)c;  //explicit up-casting
//		B1 b = c;      //implicit up-casting
		b.test1();
		b.test2();
//		b.test3();     //error
		System.out.println();

		A1 a = (A1)c;  //explicit up-casting
//		A1 a = c;      //implicit up-casting
		a.test1();
//		a.test2();
//		a.test3();
		System.out.println();
	}
}