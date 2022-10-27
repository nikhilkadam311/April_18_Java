package org.encapsulationEx1;
class Parent1 {
	private int a=10,b=20;
	private void test1() {                // X private
		System.out.println("Test 1");
	}
	private void test2() {                // X private
		System.out.println("Test 2");
	}
	public void test3() {                  // public
		System.out.println("Test 3");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		test1();
		test2();
}
}
	public class Ex1 {
		public static void main(String[] args) {
			System.out.println("**** Programs Starts ");
			Parent1 obj = new Parent1() ;
	//		System.out.println(obj.a);       // X another class
	//		System.out.println(obj.b);       // X another class
	//		obj.test1();                     // X another class
	//		obj.test2();                     // X another class
			obj.test3();         //Public allow another class      
			System.out.println("**** Programs Ends ");
		}
	}