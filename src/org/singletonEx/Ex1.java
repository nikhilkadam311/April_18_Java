package org.singletonEx;

class Parent1 {
	int a=10;
	private Parent1() { }  //constructor
	public static Parent1 getParent1Object() {
		Parent1 obj = new Parent1();
		return obj;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		//	Parent1 obj = new Parent1();  //error
		Parent1 obj1 = Parent1.getParent1Object();
		System.out.println("obj1.a = "+obj1.a);	 //10
		obj1.a =50;
		System.out.println("obj1.a = "+obj1.a);	 //50

		System.out.println("**********************");

		//Parent1 obj2 = new Parent1();  //error
		Parent1 obj2 = Parent1.getParent1Object();
		System.out.println("obj2.a = "+obj2.a);	 //10
		obj1.a =50;
		System.out.println("obj2.a = "+obj2.a);	 //50

		System.out.println("**********************");

		//Parent1 obj3 = new Parent1();  //error
		Parent1 obj3 = Parent1.getParent1Object();
		System.out.println("obj3.a = "+obj3.a);	 //50
	}
}