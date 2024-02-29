package com.javaExceptionPropagation;

public class Example1 {
	
	//methods
	
	//method-1: getDivision
	public static int getDivision(int a, int b)
	{
		return a/b;
	}
	
	//method-2: getResult
	public static int getResult(int x, int y)
	{
		int div = getDivision(x, y);
		return div;
	}

	public static void main(String[] args) {
		
		System.out.println("start of the program");
		
			
		try
		{
			System.out.println(Example1.getResult(100, 0));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("end of the program");

	}

}
