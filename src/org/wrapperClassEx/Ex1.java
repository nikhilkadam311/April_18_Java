package org.wrapperClassEx;

public class Ex1 {
	public static void main(String[] args) {
		int a = 10;           
		Integer iObj1 = a ;   
		Integer iObj2 = Integer.valueOf(a);   //boxing
		
		Double dObj = Double.valueOf(a);      //widening then boxing
		
		Byte bObj = Byte.valueOf((byte)a);    //explicit narrowing then boxing
	}
}