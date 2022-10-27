package org.lamdaFunEx;

interface Interf2 {
	public int lengthOf(String str);
}
interface Interf3 {
	public int addition(int a, int b);
}
public class Ex2 {
	public static void main(String[] args) {
	//	Interf1 obj = new Interf1();  //error
		Interf2 obj1=(s)->{
			return s.length(); };
			System.out.println("lenth is:" +obj1.lengthOf("pune"));
		
		Interf3 obj2= (a,b)-> {
			return a+b;	
		};
		System.out.println("addition is:" +obj2.addition(10,20));
	}
}


