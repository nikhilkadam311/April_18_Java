// indexing is not present in Set,data will randomly stored
//duplicate data is not accept in collection
package org.collectionPractice;

import java.util.HashSet;

public class SetEx2 {

	public static void main(String[] args) {
	System.out.println("*** Program Starts ***");
	HashSet<String> h1 = new HashSet<String>();
	h1.add("USA");
	h1.add("UK");
	h1.add("Pune");
	h1.add("Mumbai");
	h1.add(null);
	h1.add("USA");
	h1.add("UK");
	h1.add("South Africa");
	h1.add("Nashik");
	h1.add("Mumbai");
	h1.add(null);
	h1.add("Kolhapur");
	System.out.println("h1 : "+h1);
	System.out.println("size : "+h1.size());
	System.out.println("*** Program Ends ***");
	}
}
