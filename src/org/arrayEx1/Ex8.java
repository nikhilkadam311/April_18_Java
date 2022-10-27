//By without using 3rd variable Swapping Of 2 Number

package org.arrayEx1;

public class Ex8 {
	public static void main(String[] args) {
		boolean flag=true;
		int num = 100;
		for(int i=2;i<(num/2);i++) 
{
	if (num%i==0)
	{
		flag=false;
		break;
	}
}
	if(flag==true) {
		System.out.println("number is prime");
		}else {
			System.out.println("num is not prime");
		}}	
	}
