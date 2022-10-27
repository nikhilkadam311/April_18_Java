 package org.finalKeyword;
// constant not allow overidding-error
 //Can't change final values like FINAL MARKS=50
class Parent1 {
	final int MARKS=50;
	final static float SUM=55.44f;
	final public void TEST1() {
		System.out.println("TEST1");
	}
	int a = 50;
	public void test2() {
		System.out.println("TEST2");
	}
}
	public class Ex2 extends Parent1 {
		
		public static void main(String [] args) {
			Ex2 obj1 = new Ex2();
			System.out.println(obj1.MARKS);
			System.out.println(obj1.SUM);
			System.out.println(obj1.a);
			obj1.TEST1();
			obj1.test2();
//			obj1.MARKS=500; //Can't change final values
	}
//		final public void TEST1() {       // constant not allow overiding-error
//			System.out.println("TEST1");
//		}
		public void test2() {             //overridding - allow       
			System.out.println("Test 2 from EX2 ");
		}
}