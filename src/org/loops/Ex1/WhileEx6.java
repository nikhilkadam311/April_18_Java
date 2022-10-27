//****************************DO WHILE LOOP used for reverse the number check number is paliandrome*****************************//
package org.loops.Ex1;
public class WhileEx6 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int num=370;
		//int num=153        Another armstrong no.
		int rem=0, sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
		}
		System.out.println("reverse="+sum);
		if (temp==sum) {
			System.out.println("Number is ARMSTRONG");
		}else {
			System.out.println("Number is not ARMSTRONG");
		}
		System.out.println("**Program Ends**");
	}
}