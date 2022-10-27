package org.stringPractice;

public class Ex1 {
public static void main(String[] args) {
	Ex1 obj1 = new Ex1();
	Ex1 obj2 = new Ex1();
	
	System.out.println("obj1==obj2 : "+(obj1==obj2));   // compare address
	System.out.println("obj1.equals(obj2) : "+(obj1.equals(obj2)));
	}

}
