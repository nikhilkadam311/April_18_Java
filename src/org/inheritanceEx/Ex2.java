package org.inheritanceEx;       //with inheritance       

class Parent2 {
	int a=0;
	public void test1() {
		System.out.println("Test 1");
	}
}
public class Ex2 extends Parent2 {
	//Parent2 data copy ....hidden
	int b=0;
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		Ex2 obj1 = new Ex2();   //with inheritance
		obj1.test1();
		System.out.println("obj1.a = "+obj1.a);
		obj1.test2();
		System.out.println("obj1.b = "+obj1.b);
		System.out.println("** Programs Ends ");
	}
	public void test2() {
		System.out.println("Test 2");
	}
}