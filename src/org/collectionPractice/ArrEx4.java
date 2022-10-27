// by declare as a <Object> ALL ERROR and warning goes.
package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx4 {
	public static void main(String[] args) {
		// user defined class object
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Pune");
		ar1.add("Mumbai");
		ar1.add("Hydrabad");
		ar1.add(null);
		ar1.add(new String("Delhi"));
		ar1.add("Mumbai");
		ar1.add("Banglore");
		ar1.add(null);
		ar1.add("Mumbai");
		ar1.add("Pune");
		System.out.println("ar1 : "+ar1);
		System.out.println();
//	    String str = ar1.get(2);        // hydrabaad
		String str = ar1.get(9);        // pune
		System.out.println(str);
		System.out.println("size = "+ar1.size());
		for (int i=0;i<ar1.size();i++) {
			System.out.println("ar1.get("+i+") : "+ar1.get(i));
		}
	}
}