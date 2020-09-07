package com.javat.serializationvsdeserialization;
import java.io.*;
public class Serialization{

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Rajni";
      e.address = "Indore, MadhyaPradesh";
      e.SSN = 111333;
      e.number = 91798987;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("F:\\New folder");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in F:\\Javatraining\\fff");
         }
      catch (IOException i) 
      {
         i.printStackTrace();
      }
   }
}
