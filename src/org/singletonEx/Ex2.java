package org.singletonEx;

class Parent2 {
	int a=10;
	private static Parent2 obj; //default value is null
	private Parent2() { }  //constructor
	public static Parent2 getParent1Instance() {
		if(obj == null) {
		obj = new Parent2();
		}
		return obj;
	}
}
public class Ex2 {
	public static void main(String[] args) {
		//	Parent2 obj1 = new Parent2();  //error
		Parent2 obj1 = Parent2.getParent1Instance();   //new memory
		System.out.println("obj1.a = "+obj1.a);	 //10
		obj1.a =50;
		System.out.println("obj1.a = "+obj1.a);	 //50

		System.out.println("**********************");

		//Parent2 obj2 = new Parent2();  //error
		Parent2 obj2 = Parent2.getParent1Instance();
		System.out.println("obj2.a = "+obj2.a);	 //10
		obj2.a =60;
		System.out.println("obj2.a = "+obj2.a);	 //50

		System.out.println("**********************");

		//Parent3 obj3 = new Parent3();  //error
		Parent2 obj3 = Parent2.getParent1Instance();
		System.out.println("obj3.a = "+obj3.a);	 //50
	}
}