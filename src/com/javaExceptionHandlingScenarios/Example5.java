package com.javaExceptionHandlingScenarios;

import java.util.InputMismatchException;
import java.util.Scanner;

//5. nested try-catch
public class Example5 {

	public static void main(String[] args) 
	{		
		
		int value1, value2;
		
		Scanner scanner = new Scanner(System.in);//Input Stream
		
		System.out.println("Enter values");
		value1= scanner.nextInt();
		value2= scanner.nextInt();		
		
		try
		{
			//inner/nested try-catch
			try
			{
				System.out.println(value1/value2);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			scanner.close();//mandatory work statements are placed in finally block
		}

	}

}
