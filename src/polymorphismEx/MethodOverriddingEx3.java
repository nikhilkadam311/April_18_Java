	package polymorphismEx;       //same program MethodOverriddingEx2
	
	class Parent12 {
		public void addition(int a,int b) {
			int sum = a+b;
			System.out.println("sum = "+sum);
		}
		public void substraction(int a,int b) {
			int sum = a-b;
			System.out.println("sum = "+sum);
		}
	}
	public class MethodOverriddingEx3 extends Parent12 { 
		public void addition(int a,int b) {  //method overridding-show green arrow
			int sum = a+b;
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("sum = "+sum);
		}
		public void substraction(int a,int b,int c) {   //method overloading-not show green arrow
			int sum = a-b;
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("sum = "+sum);
		}
		public static void main(String[] args) {
			System.out.println("** Programs Starts ");
			MethodOverriddingEx3 obj = new MethodOverriddingEx3();
			obj.addition(10,20);
			obj.substraction(90,40);
			System.out.println("** Programs Ends ");
		}
	}