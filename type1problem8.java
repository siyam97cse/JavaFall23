//Write a program that converts temperature from Fahrenheit to Celsius.

import java.util.Scanner;
public class type1problem8 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");
        double f = input.nextDouble();

        double  c =(( 5.0 *(f - 32.0)) / 9.0);
        System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");
    }
}
