package com.javat.exceptionhandling;
import java.io.*; 
 class Test
{
	 void method()throws IOException
	 {  
	  throw new IOException("device error");  
	 }  
}  
	public class ThrowsEx
	{  
	   public static void main(String args[])
	   {  
	    try{  
	     Test m=new Test();  
	     m.method();  
	       }
	    catch(Exception e){System.out.println("exception handled");
	    }     
	  
	    System.out.println("normal flow of program");  
	  }   
}
