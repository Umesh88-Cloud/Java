package Method;

import java.util.Scanner;

/*
Objective:
Create a Java program that converts temperature between Celsius and Fahrenheit using methods.

Requirements:

Method: celsiusToFahrenheit(double c), fahrenheitToCelsius(double f)

Take user input for temperature and the conversion direction.

Print the result using a separate display() method.


 */
public class Temperature_Converter {

    public static void celsiusToFahrenheit(double c){
        System.out.println("Temperature In Fahrenheit: " + (c * 9/5) + 32);

    }
    public static void fahrenheitToCelsius(double f){
        System.out.println("Temperature In celsius : "+ (f-32) * 5/9 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature In Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Enter Temperature In Fahrenheit: ");
        double f = sc.nextDouble();

      celsiusToFahrenheit(c);
      fahrenheitToCelsius(f);

    }
}
