package polymorphismEx;       //

class Parent1 {
	public void addition(int a,int b) {
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	public void substraction(int a,int b) {
		int sum = a-b;
		System.out.println("sum = "+sum);
	}
}
public class MethodOverriddingEx2 extends Parent1 { 
	public void addition(int a,int b) {  //method overridding
		int sum = a+b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("sum = "+sum);
	}
	public void substraction(int a,int b) {
		int sum = a-b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("sum = "+sum);
	}
	public static void main(String[] args) {
		System.out.println("** Programs Starts ");
		MethodOverriddingEx2 obj = new MethodOverriddingEx2();
		obj.addition(10,20);
		obj.substraction(90,40);
		System.out.println("** Programs Ends ");
	}
}