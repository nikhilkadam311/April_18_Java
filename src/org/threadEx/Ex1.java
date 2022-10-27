package org.threadEx;

public class Ex1 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		Ex1 obj = new Ex1();
		obj.start();
		Thread.sleep(1000);
		for(int k=51;k<61; k++) {
			System.out.println("k = "+k);
		}
		System.out.println("** Program Ends **");
	}
	public void run() {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run Starts");
		for(int i=1; i<11; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("Run Ends");
	}
}