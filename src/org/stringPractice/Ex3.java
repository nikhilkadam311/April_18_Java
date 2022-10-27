package org.stringPractice;

public class Ex3 {
	public static void main(String[] args) {
		String str1 = " Pune ";
		System.out.println(str1);
		int size = str1.length();
		System.out.println("size = "+size);

		String str2 = " Pune ";

		str1 = str1.trim();
		
		size = str1.length();
		System.out.println("size = "+size);
		System.out.println(str1);     //Pune
		System.out.println(str1 ==str2);

		System.out.println(str1.indexOf('W'));    //-1
		System.out.println(str1.indexOf('P'));    //0
		System.out.println(str1.indexOf('p'));    //-1

		System.out.println(str1.charAt(0));    //P
		//System.out.println(str1.charAt(-1));    //ERROR
		System.out.println(str1.charAt(3));    //e
	}
}