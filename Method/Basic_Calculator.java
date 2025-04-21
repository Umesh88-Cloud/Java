package Method;

import java.util.Scanner;

/*

 Basic Calculator
Objective:
Create a simple calculator using Java methods.

Requirements:

Methods: add(), subtract(), multiply(), divide()

Input: Two numbers and an operator (+, -, *, /)

Output: Result of the operation

 */
public class Basic_Calculator {
    // Method for Addition
    public static  int add(int a,int b){
        System.out.print("Addition of two number is : ");
        return a+b;
    }
    // Method for Subtraction
    public static int subtract(int a,int b){
        System.out.print("Subtraction of two number is : ");
        return a-b;
    }
    // Method for Multiplication
    public static int multiply(int a,int b){
        System.out.print("Multiplication of two number is : ");
        return a*b;
    }
    // Method for divide
    public static int divide(int a, int b){
        try {
            System.out.print("Division of two number is : ");
            return a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.println(add(num1,num2));
        System.out.println(subtract(num1,num2));
        System.out.println(multiply(num1,num2));
        System.out.println(divide(num1,num2));

    }
}
