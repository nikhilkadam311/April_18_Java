package org.singletonEx;

class Parent3 {
	int a=10;
	private static Parent3 obj; //default value is null
	private static int counter = 1;
	private Parent3() { }  //constructor
	public static Parent3 getInstance() {
		if(counter <= 3) {   //1,2,3,4
		obj = new Parent3();
		counter++;
		}
		return obj;
	}
}
public class Max3ObjectsEx {
	public static void main(String[] args) {
		Parent3 obj1 = Parent3.getInstance();   //new memory
		System.out.println("obj1.a = "+obj1.a);	 //10
		obj1.a =50;
		System.out.println("obj1.a = "+obj1.a);	 //50

		System.out.println("**********************");
				Parent3 obj2 = Parent3.getInstance();   //new memory
		System.out.println("obj2.a = "+obj2.a);	 //10
		obj2.a =60;
		System.out.println("obj2.a = "+obj2.a);	 //50

		System.out.println("**********************");
		Parent3 obj3 = Parent3.getInstance();   //new memory
		System.out.println("obj3.a = "+obj3.a);	 //10
		obj3.a =70;
		System.out.println("obj3.a = "+obj3.a);	 //70
		
		System.out.println("**********************");
		Parent3 obj4 = Parent3.getInstance();   //obj3 memory
		System.out.println("obj4.a = "+obj4.a);	 //70
		
		System.out.println("**********************");
		Parent3 obj5 = Parent3.getInstance();   //obj3 memory
		System.out.println("obj5.a = "+obj5.a);	 //70
	}
}