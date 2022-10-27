// by declare as a <Object> ALL ERROR and warning goes.
package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx2 {
	public static void main(String[] args) {
		// user defined class object
		ArrEx2 obj = new ArrEx2();
		ArrayList<Object> ar1 = new ArrayList<Object>();  //different package,so need to import public
	
		// collection arraylist object
		ar1.add("Mumbai");  // collection are slow than array
		ar1.add("Pune");
		ar1.add(new String("Mumbai"));   //duplicate value allow
		ar1.add(Integer.valueOf(10));    //boxing
		ar1.add(-99);    //java 1.8 feature //implicit boxing
		ar1.add(99.88);  //java 1.8 feature //implicit boxing
		ar1.add(Character.valueOf('r'));
		ar1.add('t');    //java 1.8 feature //implicit boxing
		ar1.add(Boolean.valueOf(true));
		ar1.add(false);  //implicit boxing
		ar1.add(Byte.valueOf((byte)70)); //narrowing-explicit boxing
		ar1.add(new ArrEx2());
		ar1.add(obj);
		System.out.println(ar1);
	}
}