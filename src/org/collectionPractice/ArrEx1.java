package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx1 {
	public static void main(String[] args) {
		// user defined class object
		ArrEx1 obj = new ArrEx1();
		ArrayList ar1 = new ArrayList();  //different package,so need to import public
	
		// collection arraylist object
		ar1.add("Mumbai");
		ar1.add("Pune");
		ar1.add(new String("Mumbai"));   //dublicate value allow
		ar1.add(Integer.valueOf(10));    //boxing
//		ar1.add(-99);    //java 1.8 feature //implicite boxing
//		ar1.add(99.88);  //java 1.8 feature //implicite boxing
		ar1.add(Character.valueOf('r'));
//		ar1.add('t');    //java 1.8 feature //implicite boxing
		ar1.add(Boolean.valueOf(true));
//		ar1.add(false);  //implicite boxing
		ar1.add(Byte.valueOf((byte)70)); //narrowing-explicite boxing
		
		ar1.add(new ArrEx1());
		ar1.add(obj);
		System.out.println(ar1);
	}
}