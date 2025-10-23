package throw1;

import java.util.Scanner;

import graphql.org.antlr.v4.runtime.InputMismatchException;

public class TryCatch_Exception {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
	try {		int age=s1.nextInt();
			
	} 
	catch(InputMismatchException a1)
	{
		System.out.println("Age must be a valid numeric value");

	}
		
     String name=s1.next();
      System.out.println(name);

     
	}

}
