package org.arrayEx1;

public class Ex3 {
	public static void main(String[] args) {
		int [][] ar =new int [4][3];
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[0][2] = 30;

		ar[1][0] = -90;
		ar[1][1] = 70;
		ar[1][2] = 80;

		ar[2][0] = 50;
		ar[2][1] = 60;
		ar[2][2] = 40;

		ar[3][0] = 50;
		ar[3][1] = 60;
		ar[3][2] = 40;
		System.out.println(ar.length);
		System.out.println(ar[0].length);
	//	System.out.println(ar [2] [2]);
		for (int i=0; i<ar.length; i++) {
			for (int j=0;j<ar[i].length; j++) {
				System.out.println("ar["+i+"]["+j+"]) = "+ar[i] [j]);
			}
			System.out.println(" ");
		}
	}
}