package org.assignment;

public class SelectionSortHighestNoEx2 {           

	public static void main(String[] args) {
		int ar[]= {10,0,20,30,50,40};
		System.out.println("Before Sorting: ");
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		int temp=0;
		for (int i=0;i<ar.length; i++) {
			for (int j=i+1; j<ar.length; j++) {
				if (ar[i] < ar[j] ) {// > symbol change selection/bubble sort to 
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			if(i==0) {
				break;
			}
		}
		System.out.println("**************");
		System.out.println(ar[0]);    // i cant highest no....in this sort
	}
}