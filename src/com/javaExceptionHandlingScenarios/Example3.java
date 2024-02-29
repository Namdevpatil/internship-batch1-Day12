package com.javaExceptionHandlingScenarios;

import java.util.Scanner;

//1. try-catch-finally
public class Example3 {

	public static void main(String[] args) 
	{		
		
		int value1, value2;
		
		Scanner scanner = new Scanner(System.in);//Input Stream
		
		System.out.println("Enter values");
		value1= scanner.nextInt();
		value2= scanner.nextInt();		
		
		try
		{
			System.out.println(value1/value2);//try block contains problematic part 
			System.out.println("try block");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally 
		{
			scanner.close();//mandatory work statements are placed in finally block
			System.out.println("finally block");
		}

	}

}
