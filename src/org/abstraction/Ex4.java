//abstract method to complete method....remove abstract word and 
//change un-implement method to implement method (by overridding)

package org.abstraction;

abstract class Parent3 { //abstract class
	abstract public  int addition (int a,int b);
	abstract public int substract (int a,int b);
	public static int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
	}
}
public class Ex4 extends Parent3 {    //abstract method to complete method by method overridding
	public  int addition (int a,int b) { //implement abstract method
		return a+b;
	}
	public int subtraction (int a, int b) { //implement abstract method
		return a-b;
	}
	public static int multiplication (int a,int b) {
		return a*b ;
	}
	public int division (int a,int b){
		return a/b ;
	}
public static void main(String[] args) {
	System.out.println("hellow");
}
public int substract(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
}