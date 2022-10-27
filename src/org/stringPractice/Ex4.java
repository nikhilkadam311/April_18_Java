package org.stringPractice;

public class Ex4 {
	public static void main(String[] args) {

		String str2 = "  Pune  ";
		System.out.println(str2.length());
		str2 = str2.trim();
		
		String str = "There is garden and it is beautiful";
		System.out.println(str);
		System.out.println("size = "+str.length());     //Pune
//		for (int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		System.out.println(str.indexOf('i'));	
		System.out.println(str.lastIndexOf('i'));		
		System.out.println(str.indexOf('i',20));	
		
		System.out.println(str.indexOf("is"));	
		System.out.println(str.lastIndexOf("is"));		
		System.out.println(str.indexOf("is",24));	

		System.out.println("starts-with : "+str.startsWith("Th"));	     //True
		System.out.println("starts-with : "+str.endsWith(" beautyful")); //True
		System.out.println("starts-with : "+str.contains(" is "));	     //True	
		
		}
}