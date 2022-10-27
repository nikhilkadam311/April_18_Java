package org.collectionPractice;

import java.util.HashMap;

public class MapEx2 {
	public static void main(String[] args) {
		HashMap<Object,Object> m1 = new HashMap<Object,Object>();
		m1.put(1,"Akshay Kumar");
		m1.put(55.44,'R');
		m1.put(90,"Salman khan");
		m1.put("Raining","Salman khan");
		m1.put(true, new MapEx2());
		m1.put(90,"Katrina kaif");
		m1.put(99,"Salman khan");
		m1.put(6564,"Akshay Kumar");
		m1.put(null,"Salman khan");
		m1.put(null, null);
		System.out.println("m1 : "+m1);
	}
	}