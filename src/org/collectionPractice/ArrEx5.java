package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx5 {
	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Pune");
		ar1.add("Mumbai");
		ar1.add("Hydrabad");
		ar1.add(null);
		ar1.add(new String("Delhi"));
		ar1.add("Hydrabad");
		System.out.println("ar1 : "+ar1);
		ar1.add("Banglore");
		System.out.println("ar1 : "+ar1);
		ar1.add(2, "USA");                 // WE CAN add particular index-position
		System.out.println("ar1 : "+ar1);  // WE CAN add particular index-position
//		ar1.remove(3);                     //1st method We can delete Particular index
//		ar1.remove("Hydrabad");            //2nd method we can delete Particular parameter,
		ar1.remove(new String("Hydrabad"));//3rd method only remove 1st occurance
		System.out.println("ar1 : "+ar1);
		ar1.set(6, "UK");                  // REPLACE/Modified values
		System.out.println("ar1 : "+ar1);
	}
}