package org.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorSetEx2 {
	public static void main(String[] args) {
		System.out.println("*** Program Starts ***");
		HashSet<String> h1 = new HashSet<String>();
		h1.add("South Africa");
		h1.add("USA");
		h1.add("UK");
		h1.add("Pune");
		h1.add(new String ("Nashik"));
		h1.add("Mumbai");
		System.out.println("h1 : "+h1);
		Iterator<String> itr = h1.iterator();
		itr.next();
		itr.remove();
		System.out.println("h1 : "+h1);
//		while (itr.hasNext()) {
//			String str =itr.next();
//			System.out.println(str);
//			if(str.equals("UK"));
//			break;
//		}}
//}
//		System.out.println("hasNext : "+itr.hasNext());
		System.out.println("*** Program Ends ***");
}}