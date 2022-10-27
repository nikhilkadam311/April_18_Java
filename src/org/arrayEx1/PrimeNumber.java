//Prime no.1 to 100;
package org.arrayEx1;

public class PrimeNumber {
	public static void main(String[] args) {
		int i,j,temp;
		for (i=1;i<=100;i++) 
		{
			temp=0;
			for(j=2;j<=i;j++)
			{
				if (i%j==0)
					temp=1;
				break;
			}
			if(temp==0)
				System.out.println(i);
		}
	}
}