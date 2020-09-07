package com.javat.encapsulation;

public class TestEncapsulation 
	{     
	    public static void main (String[] args)  
	    { 
	        Encapsulate obj=new Encapsulate(); 
	            
	        obj.setName("Rajni"); 
	        obj.setAge(22); 
	        obj.setRoll(51); 
	          
	        // Displaying values of the variables 
	        System.out.println("name: " + obj.getName()); 
	        System.out.println("age: " + obj.getAge()); 
	        System.out.println("roll: " + obj.getRoll()); 
	                 
	    } 
	} 

