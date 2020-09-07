package com.javat.inheritance;
  
class one 
{ 
    public void showA() 
    { 
        System.out.println("one"); 
    } 
} 
  
class two extends one 
{ 
    public void showB() 
    { 
        System.out.println("two"); 
    } 
} 
// Driver class 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        two obj = new two(); 
        obj.showA(); 
        obj.showB(); 
        obj.showA(); 
    } 
} 
