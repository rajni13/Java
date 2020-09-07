package com.javat.string;

public class Equals
{
	public static void main(String[] args) 
	{  
        String s1 = "javatraining";    
        String s2 = "javatraining";    
        String s3 = "Javat";  
        System.out.println(s1.equals(s2)); 
        
        if (s1.equals(s3))
            System.out.println("both strings are equal");  
        else 
        	System.out.println("both strings are unequal");     
    } 
}
