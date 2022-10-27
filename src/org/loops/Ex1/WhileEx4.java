//****************************DO WHILE LOOP used for reverse the number*****************************//
package org.loops.Ex1;
public class WhileEx4 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int num=4567;
		int rem=0, sum=0;
		int temp=num;

		while(num>0)
		{rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		}
		System.out.println("reverse="+sum);
		System.out.println("**Program Ends**");
	}
}