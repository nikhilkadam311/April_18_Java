package org.inheritanceEx;       //with inheritance       
// super(...)statement is hidden in all the constructor
// super(...)statement should always be the first statement of constructor.
//but we can't write both super(...)and this(...) statement in same constructor


class Parent3 extends Object {  //default hidden
	public Parent3() {
		super(); // by default hidden in all default constructor
		System.out.println("Default Parent3");
	}
}
class Parent4 extends Parent3 {
	public Parent4() {
		super(); // by default hidden in all default constructor
		System.out.println("Default Parent4");
	}
}
class Parent5 extends Parent4{
	public Parent5() {
		super(); // by default hidden in all default constructor
		System.out.println("Default Parent5");
	}
}
public class ChainingOfConEx1 extends Parent5 {
	public ChainingOfConEx1() {             // create constructor
		super(); // by default hidden in all default constructor
		System.out.println("Default ChainingOfConEx1");
	}
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		ChainingOfConEx1 obj1 = new ChainingOfConEx1();
		System.out.println("** Programs Ends ");
	}
}