package org.inheritanceEx;       //without inheritance

class Parent1 {
	int a=0;
	public void test1() {
		System.out.println("Test 1");
	}
}
public class Ex1 {
int b=0;
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		Parent1 obj1 = new Parent1();   //without inheritance
		obj1.test1();
			System.out.println("obj1.a = "+obj1.a);
			Ex1 obj2 = new Ex1();   //without inheritance
			obj2.test2();
			System.out.println("obj2.b = "+obj2.b);
		System.out.println("** Programs Ends ");
	}
	public void test2() {
		System.out.println("Test 2");
	}
}