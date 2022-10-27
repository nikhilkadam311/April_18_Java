package org.conditionalStatements;

public class MarksEx1 {
	public static void main(String[] args) {
		System.out.println("**Programs Starts**");
		int marks = 66;
		if (marks>=40)
		{
			if (marks>=50)
			{
				if (marks>=60)
				{
					if (marks>=66) 
					{
						System.out.println("Distintion");
					}else {
						System.out.println("first class");	
					}
				}else {
					System.out.println("Second class");
				}
			}else {
				System.out.println("Pass Class");
			} 

		}
		System.out.println("**Programs Ends**");
	}
}