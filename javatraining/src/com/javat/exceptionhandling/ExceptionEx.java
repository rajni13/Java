package com.javat.exceptionhandling;

public class ExceptionEx 
{  
		  public static void main(String args[])
		  {  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		     }
		   catch(ArithmeticException e)
		    {
			   System.out.println(e);
			}  
		  
		   System.out.println("Catched Exception");  
		   
		  }  
}
