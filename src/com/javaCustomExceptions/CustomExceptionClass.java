package com.javaCustomExceptions;

public class CustomExceptionClass {
	
	public static void validateThePerson(int personAge)throws AgeProblemException
	{
		
		if(personAge >= 18)
		{
			System.out.println("the person is able to cast the vote.");
		}
		else
		{
			throw new AgeProblemException("not able to cast the vote.");
		}
			
	}

	public static void main(String[] args) {

		try
		{
			CustomExceptionClass.validateThePerson(17);
		}
		catch(AgeProblemException e)
		{
			e.printStackTrace();
		}

	}

}
