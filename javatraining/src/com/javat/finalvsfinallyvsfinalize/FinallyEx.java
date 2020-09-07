package com.javat.finalvsfinallyvsfinalize;

public class FinallyEx 
{
	public static void main(String[] args)
	{  
		try
		{  
		int x=300;  
		}
		catch(Exception e)
		{
			System.out.println(e);
	    } 
		
		finally
		{
			System.out.println("finally block is executed");
		}  
	}
}
