package org.threadEx;

public class Ex2 implements Runnable {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		Ex2 obj = new Ex2();
		Thread th = new Thread(obj);
		th.start();
//		Thread.sleep(1000);
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