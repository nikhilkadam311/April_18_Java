package org.wrapperClassEx;

public class UnBoxingEx2 {
	public static void main(String[] args) {
		Integer aObj1 = 10;             //java 1.8 feature
		int a = aObj1.intValue();       //un-boxing
		int a1 = aObj1;                  //auto-boxing

		System.out.println("aObj1 = "+aObj1);
		System.out.println("a = "+a);

		byte b=50;
		Byte bObj = b;                  //boxing
		byte b2 = bObj.byteValue();
		double d1 = bObj.doubleValue();
	}
}
