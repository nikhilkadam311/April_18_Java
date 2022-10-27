// compile time exception
//when we work on file use file class,file input stream class
package org.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingE {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");	   //type 1 - hard core path
		File f = new File("C:\\workspace\\April_18_Java\\MainMethodExec\\FileReadingEx.java" );
                        //OR
//		String path = System.getProperty("user.dir");  // type 3 - user current directory through java
//		System.out.println("path = "+path);
//		File f = new File(path+"\\mainMethodExec\\FileReadingEx.txt");
		                //OR
//		File f = new File("./MainMethodExec/FileReadingEx.txt");	   // type 2 - Short-cut
		try {
			FileReader fr = new FileReader(f);   //import 
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) !=null) {
				System.out.println(str);
			}
			br.close();
		} catch(FileNotFoundException e) {        //import
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("** Program Ends **");		
	}
}