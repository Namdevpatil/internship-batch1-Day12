package com.javaExceptionHandlingScenarios;

//1. try-catch
public class Example1 {

	public static void main(String[] args) {
		
		String text = null;
		
		try
		{
			System.out.println(text.charAt(0));//try block contains problematic part 
		}
		catch(Exception e)//handler for the problem which is occurred in try block
		{
			e.printStackTrace();
		}

	}

}
