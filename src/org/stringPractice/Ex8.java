package org.stringPractice;

public class Ex8 {
	public static void main(String[] args) {
		// "thERe is GaRdEN aNd IT iS BeAutIfUL"
		String str = "thERe is GaRdEN aNd IT iS BeAutIfUL";
String result = "";
//		String str = "There Is Garden And It Is Beautiful";  //toLowerCase
//		String str = "tHERE iS gARDEN aND iT iS bEAUTYFUL";  //toUpperCase

		str = str.toLowerCase();
		String ar[] = str.split(" ");

	//	String str1 = ar[0];   //there
	//	String str2 = str1.substring(0, 1); //t
	//	String str3 = str2.toUpperCase();   //T
	//	String str4 = str3.concat(str1.substring(1));
	//	System.out.println(str4);
	
	//	System.out.println(str3.concat(str3.substring(1)));
	//	System.out.println(str2.toUpperCase().concat(str1.substring(1)));
	//	System.out.println(str1.substring(0,1).toUpperCase().(str1.substring(1))));concat(str1.substring(1)));
		for(int i=0; i<ar.length; i++) {
			result = result+" " +ar[i].substring(0,1).toUpperCase().concat(ar[i].substring(1));
		//	System.out.println(ar[i].substring(0,1).toUpperCase().concat(ar[i].substring(1));
		}
		result = result.trim();
		System.out.println(result);
	}
}