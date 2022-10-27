
package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx6 {  
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(22);
		ar1.add(66);
		ar1.add(155);
		ar1.add(33);
		ar1.add(Integer.valueOf(111));
		ar1.add(77);
		ar1.add(44);
		ar1.add(22);
		ar1.add(33);
		ar1.add(66);
		ar1.add(55);
		System.out.println("ar1 : "+ar1);// fix location 
		ar1.remove(Integer.valueOf(11));
//		ar1.remove(1);                      // remove index 
//		ar1.remove(Integer.valueOf(111));   // remove object
//		System.out.println("ar1 : "+ar1);// fix location 

		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(44);
		ar2.add(22);
		ar2.add(66);
		ar2.add(33);
//		ar2.add(Integer.valueOf(11));
		ar2.add(77);
		ar2.add(55);
//		ar2.add(100);
		System.out.println("ar2 : "+ar2);
		System.out.println("*********");
//		ar1.removeAll(ar2);              // 1st matching & dublicate value remove
//		ar1.retainAll(ar2);              // 2nd  matching & dublicate data add in ar1
//		ar1.addAll(ar2);   //3rd we can add 1 collection inside another collection
//		System.out.println(ar1.contains(111)); //4th-check implicit contain value in boolean form
//		System.out.println(ar1.contains(Integer.valueOf(111))); //4th-check explicit contain value in boolean form
		System.out.println(ar1.containsAll(ar2));
		System.out.println("ar1 : "+ar1);
		System.out.println("ar2 : "+ar2);
	}
}