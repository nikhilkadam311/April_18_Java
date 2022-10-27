package org.stringPractice;

public class Ex5_5 {
	public static void main(String[] args) {
		String str = "There is garden and it is beautiful";
		System.out.println(str);
		System.out.println(str.length());     

		//	str = str.toUpperCase();
		//	System.out.println(str);
		//	
		//	str = str.toLowerCase();
		//	System.out.println(str);

		System.out.println(str.substring(10));
		System.out.println(str.substring(10,13));
		//System.out.println(str.subSequence(10,str.length()));

		String []ar = str.split("is");
		System.out.println(ar[0]);
		System.out.println(ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].trim());
		}
	}
}