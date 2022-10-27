package org.stringPractice;

public class Ex6 {
	public static void main(String[] args) {
		String str = "There is garden and it is beautiful";
		System.out.println(str.replace('e', 'Q'));
		System.out.println(str.replaceFirst("e", "Q"));
		System.out.println(str.replaceAll(" is ", "QQQQ"));

		String str1 = "Pune";
		String str2 = "Mumbai";
		String str3 = str1+" "+str2;
		System.out.println(str3);
		String str4 =str1.concat(" "+str2);
		System.out.println(str4);

		String str5 = "Mumbai";           //reverse string
	String reverse = "";
		for(int i=str5.length()-1; i >=0 ; i--) 
		{
			reverse = reverse +str5.charAt(i);
		}
		System.out.println(reverse); 
	}
}