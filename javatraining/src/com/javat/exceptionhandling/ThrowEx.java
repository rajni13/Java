package com.javat.exceptionhandling;

public class ThrowEx
{
	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("can not vote");  
	     else  
	      System.out.println("can vote");  
	   }  
	   public static void main(String args[]){  
	      validate(16);  
	      System.out.println("rest code");  
	  }  
}
