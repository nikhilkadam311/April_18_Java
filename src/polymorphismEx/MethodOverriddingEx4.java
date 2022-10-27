package polymorphismEx;       //i want call parent mothod.again

class Parent13 {
	public void addition(int a,int b) {
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	public void substraction(int a,int b) {
		int sum = a-b;
		System.out.println("sum = "+sum);
	}
}
public class MethodOverriddingEx4 extends Parent13 { 
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
		MethodOverriddingEx4 obj = new MethodOverriddingEx4();
		obj.addition(10,20);
		obj.substraction(90,40);
		
		System.out.println("***********");
		Parent13 obj2 = new Parent13();
		obj2.addition(80, 90);
		obj2.substraction(100, 200);
		System.out.println("** Programs Ends ");
	}
}