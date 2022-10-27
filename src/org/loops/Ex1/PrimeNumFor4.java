//****************************Prime Number *****************************//
package org.loops.Ex1;
public class PrimeNumFor4 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		boolean flag=true;
		int num=19;
		for(int i=2; i<(num/2); i++)
		{
			if (num%i==0)
			{
				flag= false;
					break;
			}
		}
		if (flag==true) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not Prime");
		}
		System.out.println("**Program Ends**");
	}
}