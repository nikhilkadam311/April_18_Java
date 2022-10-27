// by declare as a <Object> ALL ERROR and warning goes.
package org.collectionPractice;

import java.util.ArrayList;

public class ArrEx3 {
	public static void main(String[] args) {
		// user defined class object
		ArrayList<Object> ar1 = new ArrayList<Object>();
		//		ar1.add(Object e);
		ar1.add(20);

		ArrayList<String> ar2 = new ArrayList<String>();
		//		ar2.add(String e);
		ar2.add(String.valueOf(20));

		ArrayList<Float> ar3 = new ArrayList<Float>();
		//		ar3.add(Float e);
//		ar3.add(Float.valueOf(20));

		ArrayList<Double> ar4 = new ArrayList<Double>();
		//		ar4.add(Double e);
		ar4.add(Double.valueOf(10));

		ArrayList<Byte> ar5 = new ArrayList<Byte>();
		//		ar5.add(Byte e);
		ar5.add(Byte.valueOf((byte)10));

		ArrayList<Character> ar6 = new ArrayList<Character>();
		//		ar6.add(Character e);
		ar6.add(Character.valueOf((char)10));

		ArrayList<Boolean> ar7 = new ArrayList<Boolean>();
		//		ar7.add(Boolean e);
		//		ar7.add(Boolean.valueOf((boolean)10));  // cannot change boolean to Int

		ArrayList<ArrEx3> ar8 = new ArrayList<ArrEx3>();
		//		ar8.add(ArraEx3 e);
		//		ar8.add(new ArrEx());  // cannot change Classname to Int
	}
}