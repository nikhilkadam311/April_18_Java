package org.collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx3 {
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

		Set<Integer> s1 = m1.keySet();
		for(Integer obj: s1) {
			System.out.println(obj);
		}
		System.out.println("All Values : ");
		Collection<String> c1 = m1.values();
		for(String obj : c1) {
			System.out.println(obj);
		}
	}
}