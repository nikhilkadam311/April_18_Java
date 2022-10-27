package accessSpecifier2;

import accessSpecifier1.Ex2;

public class OutsidePack {
	public static void main(String[] args) {
//		System.out.println("a = "+Ex2.a);     // Error //private
//		System.out.println("b = "+Ex2.b);     // Eroor default
//		System.out.println("c = "+Ex2.c);     // Eroor protected
		System.out.println("d = "+Ex2.d);     // public
	}
}