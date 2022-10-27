package org.arrayEx1;

public class Ex4 {
	public static void main(String[] args) {
		int [][] ar = new int [2][2];
		System.out.println(ar [0] [0]);
		System.out.println("**********************");
		int []ar1 = {10,2,0,1,0,5,0,0,-90};
		int []ar2 = new int [ar1.length];
		int counter=0;
		for (int i=0; i<ar1.length; i++) {
			if (ar1[i]!=0) {
				ar2[counter] = ar1[i];
				counter++;
			}
		}
		for (int i=0; i<ar2.length; i++)
		System.out.println(ar2[i]);
	}
	}