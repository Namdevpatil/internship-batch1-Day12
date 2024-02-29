package com.javaCustomExceptions;

//step1: if we want to create custom exception classes, that class should extends Exception class.
public class AgeProblemException extends Exception
{

	
	private static final long serialVersionUID = 1L;

	//step2: take parameterized constructor with super() method
	public AgeProblemException(String exception) {
		
		super(exception);
		
	}	

}
