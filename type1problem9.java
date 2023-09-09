//Implement a program that calculates the area of a triangle given its base and
height.

import java.util.Scanner;

public class type1problem9
 {  
   public static void main (String args[])  
    {         
              Scanner input = new Scanner(System.in);

        System.out.println("Input base of the Triangle: ");
        double b = input.nextDouble();
       
        System.out.println("Input hight of the Triangle: ");
        double h = input.nextDouble();
        
                       double  area = ( b*h) / 2.0 ;  
                         System.out.println("Area of Triangle is: "+area);  
    }
     
 }  
