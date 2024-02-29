package com.javaExceptionHandlingScenarios;

//2. try-catch-catch

/**
 * Unreachable catch block for NullPointerException. 
 * It is already handled by the catch block for Exception
 */
public class Example2 {

	public static void main(String[] args) {
		
		String text = null;
		
		try
		{
			System.out.println(text.charAt(0));//try block contains problematic part 
		}
		catch(NullPointerException e)//handler for the problem which is occurred in try block
		{
			e.printStackTrace();
		}
		catch(Exception e)//handler for the problem which is occurred in try block
		{
			e.printStackTrace();
		}
		
	}

}
