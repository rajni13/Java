package com.javat.string;

public class ValueOf 
{
	public static void main(String[] args) {  
        boolean b1=true;  
        byte b2=11;      
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'}; 
        String s1 = String.valueOf(b1);    
        String s2 = String.valueOf(b2);        
        String s3 = String.valueOf(i);    
        String s4 = String.valueOf(l);    
        String s5 = String.valueOf(f);    
        String s6 = String.valueOf(d);    
        String s7 = String.valueOf(chr);        
        System.out.println(s1);  
        System.out.println(s2);   
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);    
    }  
}
