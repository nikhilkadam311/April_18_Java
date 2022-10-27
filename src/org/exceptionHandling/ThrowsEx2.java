// compile time exception
//when we work on file use file class,file input stream class
package org.exceptionHandling;

public class ThrowsEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");	   //type 1 - hard core path
		ThrowsEx2 obj = new ThrowsEx2();
		obj.test();
		System.out.println("** Program Ends **");
	}
	public void test() throws InterruptedException {
		System.out.println("Read file data starts");
		for (int i=1;i<11;i++) {
			System.out.println(i);
			if(i==5) {
				Thread.sleep(5000);  //Unhandled exception type InterruptedException
			}
		}
		System.out.println("** Reading complete **");		
}}