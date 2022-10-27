package org.inheritanceEx;          

class ParentD{             
	int a=50,b=60;
	public void ParentDMethod( ) {
		System.out.println("** parentDMethod ");
	}
}
public class SuperEx2 extends ParentD {
	int a=10,b=20;
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		SuperEx2 obj1 = new SuperEx2();
		obj1.test();
		System.out.println("** Programs Ends ");
	}
	public void test() {
		System.out.println("this.a = "+this.a);
		System.out.println("this.b = "+this.b);
		System.out.println("super.a = "+super.a);  //Global variable calling-super.a
		System.out.println("super.b = "+super.b);  //Global variable calling-super.b
		super.ParentDMethod();                     //Global method calling-super.a
	}
}
