package polymorphismEx;       //

class Parent11 {
	public void addition(int a,int b) {
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	public void substraction(int a,int b) {
		int sum = a-b;
		System.out.println("sum = "+sum);
	}
}
public class MethodOverriddingEx1 extends Parent11 { 

	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		MethodOverriddingEx1 obj = new MethodOverriddingEx1();
		obj.addition(10,20);
		obj.substraction(90,40);
		System.out.println("** Programs Ends ");
	}
}