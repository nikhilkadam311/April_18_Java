//package org.arrayEx1;

public class BobbleSortEx {
public static void printArray(int ar[]) {
	for (int i=0; i<ar.length; i++) {
		System.out.print(ar[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) 
	{
		int ar[] = {7,8,3,1,2};
		for (int i=0; i<ar.length-1;i++) {
			for (int j=0; j<ar.length-i-1;j++) {
				if(ar[j] >ar[j+1]) {
					//swap
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
printArray(ar);
	}
}