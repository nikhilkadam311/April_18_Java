// indexing is not present in Set,data will randomly stored
package org.collectionPractice;

import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {
	System.out.println("*** Program Starts ***");
	HashSet<Object> h1 = new HashSet<Object>();
	h1.add("Pune");
	h1.add("Mumbai");
	h1.add(null);
	h1.add(Integer.valueOf(10));
	h1.add(55.44f);
	h1.add(true);
	h1.add(Character.valueOf('R'));
	h1.add('t');
	h1.add(new SetEx1());
	System.out.println("h1 : "+h1);
	System.out.println("*** Program Ends ***");
	}
}
