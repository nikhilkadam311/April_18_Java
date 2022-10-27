package org.collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1,"Akshay Kumar");
		m1.put(-99,"Gopal Varma");
		m1.put(90,"Salman khan");
		m1.put(00,"Raining");
		m1.put(77,"USA");
		m1.put(40,"Katrina kaif");
		m1.put(99,"Salman khan");
		m1.put(100,"Ajay Devgan");
		m1.put(10,"Pune");
		m1.put(21, "Mumbai");
		System.out.println("m1 : "+m1);
//		m1.remove(00);  //remove key
//		System.out.println("m1 : "+m1);
		m1.remove(00,"Akshay Kumar");  //not-remove required key-value same
		System.out.println("m1 : "+m1);
		m1.remove(00,"Raining");  //remove key-value same
		System.out.println("m1 : "+m1);
	}
}
