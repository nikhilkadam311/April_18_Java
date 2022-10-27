package org.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.scannerClass.Ex2;

public class FileReadingEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");	
		File f = new File("C:\\workspace\\April_18_Java\\MainMethodExec\\FileReadingEx.java" );
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a : ");	
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine())
			System.out.println(str);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("** Program Ends **");		
	}
}