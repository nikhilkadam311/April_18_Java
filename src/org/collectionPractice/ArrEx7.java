package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx7 {  
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(22);
		ar1.add(66);
		ar1.add(155);
		ar1.add(33);
		ar1.add(Integer.valueOf(111));
		ar1.clear();   // clear method-not show above record 
		System.out.println("ar1 : "+ar1);
		ar1.add(77);
		ar1.add(44);
		ar1.add(22);
		ar1.add(33);
		ar1.add(66);
		ar1.add(55);
		System.out.println("ar1 : "+ar1);// fix location 
	}
}