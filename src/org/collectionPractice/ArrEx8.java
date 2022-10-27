package org.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrEx8 {  
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		System.out.println("isEmpty : "+ar1.isEmpty());
		System.out.println("size : "+ar1.size());
		ar1.add(22);
		ar1.add(66);
		ar1.add(-55);
		ar1.add(155);
		ar1.add(11);
		ar1.add(33);
		ar1.add(Integer.valueOf(111));
		System.out.println("isEmpty : "+ar1.isEmpty());
		System.out.println("size : "+ar1.size());
		System.out.println("Orignal ar1 : "+ar1);
		Collections.sort(ar1);        //ascending
		System.out.println("asc ar1 : "+ar1);
		Collections.reverse(ar1);        //descending
		System.out.println("desc ar1 : "+ar1);
	}
}