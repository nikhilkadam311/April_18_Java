package org.stringPractice;

public class Ex2 {
	public static void main(String[] args) {
		String str1 = new String("Pune");
		String str2 = new String("Pune");
		String str3 = "Pune";
		String str4 = "Pune";

		System.out.println("str1==str2 : "+(str1==str2)); //compare address
		System.out.println("str1.equals(str2) : "+(str1.equals(str2)));  //compare data inside object

		System.out.println("str1==str3 : "+(str1==str3)); //compare address
		System.out.println("str1.equals(str3) : "+(str1.equals(str3)));  //compare data inside object

		System.out.println("str3==str4 : "+(str3==str4)); //compare address
		System.out.println("str3.equals(str4) : "+(str3.equals(str4)));  //compare data inside object

		String str5 = str1;
		String str6 = str3;
		String str7 = str4;
		String str8 = str5;
		String str9 = str6;
		//assignment for these object
	}
}
