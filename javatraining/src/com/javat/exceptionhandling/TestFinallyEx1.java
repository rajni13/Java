package com.javat.exceptionhandling;

public class TestFinallyEx1 
{
	public static void main(String[] args) 
      { 
        int k = 66; 
        try { 
            System.out.println("In try block"); 
            int z=k/0; 
            System.out.println("Flow dosen't came here"); 
            } 
  
        catch (ArithmeticException e) 
          { 
            System.out.println("In catch block"); 
            System.out.println("arithmaticException"); 
          } 
        finally
        { 
            System.out.println("Executes whether an exception occurs or not"); 
        } 
      }
}
