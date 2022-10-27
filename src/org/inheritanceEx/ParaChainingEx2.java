package org.inheritanceEx;       //with inheritance       
// super(...)statement is hidden in all the constructor
// super(...)statement should always be the first statement of constructor.
//but we can't write both super(...)and this(...) statement in same constructor
//by default super() statement don't have any parameter .that's why it is calling default costructor of parent class.


class Parent6 extends Object {  //default hidden
	public Parent6() {} // required this default constructor then get output
	public Parent6(int a) { // if u add parametric constuctor so error occure.
		//		super(); // by default hidden in all default constructor
		System.out.println("Default Parent3");
	}
}
class Parent7 extends Parent6 {
	public Parent7() {
		//		super(); // by default hidden in all default constructor
		System.out.println("Default Parent4");
	}
}
class Parent8 extends Parent7{
	public Parent8() {
		//		super(); // by default hidden in all default constructor
		System.out.println("Default Parent5");
	}
}
public class ParaChainingEx2 extends Parent5 {
	public ParaChainingEx2() {             // create constructor
		super(); // by default hidden in all default constructor
		System.out.println("Default ChainingOfConEx1");
	}
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		ParaChainingEx2 obj1 = new ParaChainingEx2();
		System.out.println("** Programs Ends ");
	}
}