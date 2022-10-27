// compile time exception
//when we work on file use file class,file input stream class
package org.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ThrowsEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("** Program Starts **");	   //type 1 - hard core path
		ThrowsEx1 obj = new ThrowsEx1();
		obj.readFileData();
		System.out.println("** Program Ends **");
	}
	public void readFileData() throws IOException {
		System.out.println("Read file data starts");
		File f = new File("C:\\workspace\\April_18_Java\\MainMethodExec\\FileReadingEx.java" );
		FileReader fr = new FileReader(f);
		String str;
		BufferedReader br = new BufferedReader(fr);
		
		while ((str = br.readLine()) !=null) {
			System.out.println(str);
		}
		br.close();
		//OR
//		File f = new File("./MainMethodExec/FileReadingEx.txt");	   // type 2 - Short-cut

//			
		
		System.out.println("** Program Ends **");		
}}