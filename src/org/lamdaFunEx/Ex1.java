package org.lamdaFunEx;


public class Ex1 {
	interface Interf1 {
		public void test1();
	}

	public static void main(String[] args) {
		Interf1 obj=()->{System.out.println("test1");
		System.out.println("test2");
		};
		obj.test1();		
	}

}



