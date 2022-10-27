// in null value not use "==null" for compare,
package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx77 {  
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(22);
		ar1.add(66);
		ar1.add(155);
		ar1.add(33);
		ar1.add(Integer.valueOf(111));
		System.out.println("ar1 : "+ar1);
		ar1.clear();                   // clear method-not show above record 
		System.out.println("ar1 : "+ar1);
		ar1.add(77);
		ar1.add(22);
		ar1.add(null);
		ar1.add(22);
		ar1.add(33);
		ar1.add(66);
		ar1.add(55);
		ar1.add(null);
		ar1.add(33);
		ar1.add(null);
		for(int i=0;i<ar1.size(); i++) {
			if(ar1.get(i)==null) {
				continue;
			}
			System.out.println(ar1.get(i));
			if(ar1.get(i)==33) {
				break;
			}
		}
		System.out.println("ar1 : "+ar1);// fix location 
	}
	}
	