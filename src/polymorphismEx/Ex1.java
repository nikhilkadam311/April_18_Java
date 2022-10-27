package polymorphismEx;       //

public class Ex1 {
	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		obj.test1();
		obj.test1(50,60.55);
		obj.test1(77);
		//****************
		obj.test2(77,88);
		obj.test2((byte)10, (short)20);
		//****************+
		obj.test3(10,'r', true);
		obj.test3('r', true, 55);
	}
	
	//1.By changing number of parameters
	public void test1() {   // 0 para
		System.out.println("Test1: 0 para");
	}
	public void test1(int a) {   // 1para
		System.out.println("Test1: int para");
	}
	public void test1(int a,double b) {   // 2 para
		System.out.println("Test1: int double para");
	}
	
	//2.changing type of parameters
	public void test2(int a,int b) {   // 2 para
		System.out.println("Test2: int int para");
	}
	public void test2(byte a,short b) {   // 2 para
		System.out.println("Test2: byte short para");
		
	}// 3.changing type of parameters

	public void test3(int a, char ch,boolean flag) {   // 1para
		System.out.println("Test3: int char boolean para");
	}
	public void test3(char ch,boolean flag,int a) {   // 2 para
		System.out.println("Test3: char boolean int para");
	}
}