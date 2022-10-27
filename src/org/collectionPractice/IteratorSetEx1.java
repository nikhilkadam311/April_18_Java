package org.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorSetEx1 {
	public static void main(String[] args) {
		System.out.println("*** Program Starts ***");
		HashSet<String> h1 = new HashSet<String>();
		h1.add("USA");
		h1.add("UK");
		h1.add("Pune");
		h1.add(new String ("UK"));
		h1.add("Mumbai");
		System.out.println("h1 : "+h1);
		System.out.println("size : "+h1.size());
		h1.remove(new String("UK"));
		System.out.println("h1 : "+h1);
		System.out.println("size : "+h1.size());
		System.out.println("*** Program Ends ***");
	}
}
