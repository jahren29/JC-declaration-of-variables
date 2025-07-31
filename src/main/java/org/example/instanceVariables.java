package org.example;

public class instanceVariables
{
    int instanceBinary = 0b1101;
    int localOctal = 072;
    double instanceDouble = 1234.95;

     public void print(){
         System.out.println("Instance Variables: ");
         System.out.println("instanceBinary = " + instanceBinary);
         System.out.println("instanceOctal = " + localOctal);
         System.out.println("instanceDouble = " + instanceDouble);
     }
}
