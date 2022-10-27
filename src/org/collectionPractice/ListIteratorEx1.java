// Indexing is present,dublicate object allow,nill value allow multiple time
package org.collectionPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
	public static void main(String[] args) {
		System.out.println("*** Program Starts ***");
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(22);
		ar.add(66);
		ar.add(-55);
		ar.add(155);
		ar.add(11);
		ar.add(33);
		ar.add(Integer.valueOf(111));
		System.out.println("original ar : "+ar);
		ListIterator<Integer> itr = ar.listIterator();
		System.out.println("hasPrevious : "+itr.hasPrevious());
		//	itr.previous();
		//		System.out.println(itr.next());
		System.out.println("hasPrevious : "+itr.hasPrevious());
		System.out.println(itr.hasPrevious());
		System.out.println("hasPrevious : "+itr.hasPrevious());
		System.out.println("*** Program Ends ***");
	}
	}