package org.stringPractice;

public class ToStringEx {
	int a;        //0
	public static void main(String[] args) {
		ToStringEx obj1 = new ToStringEx(); 
		ToStringEx obj2 = new ToStringEx(); 
		ToStringEx obj3 = new ToStringEx(); 
	//	System.out.println(obj1);
	//	System.out.println(obj2.toString());
		System.out.println(obj3.toString());

		System.out.println("obj1.a : "+obj1.a); 
		System.out.println("obj2.a : "+obj2.a);
		System.out.println("obj3.a : "+obj3.a);
	}
	// actual representation
	public String toString() {
		a = 100;
	//	return "Pune";
		return getClass().getName()+'@'+ Integer.toHexString(hashCode());
	}
}