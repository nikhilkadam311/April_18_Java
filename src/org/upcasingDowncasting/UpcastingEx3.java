package org.upcasingDowncasting;

interface Interf1 {
	public void test1() ;
}
interface Interf2 extends Interf1 {
	public void test1() ;
}
public class UpcastingEx3 implements Interf2{
	public static void main(String[] args) {
		UpcastingEx3 obj1 = new UpcastingEx3();
		obj1.test1();  
		System.out.println("************");
		
		Interf2 obj_inter1 = obj1;  //implicit upcasting
		Interf2 obj_inter2 = (Interf2)obj1;  //explicit upcasting
		Interf2 obj_inter3 = new UpcastingEx3();  //implicit upcasting
		obj_inter1.test1();
		obj_inter2.test1();
		obj_inter3.test1();
	}
	public void test1() {
		System.out.println("Test 1");
}
}