package Method;

import java.util.Scanner;

/*
Simple Interest Calculator
Objective:
Calculate simple interest using a Java method.

Requirements:

Method: double calculateInterest(double principal, double rate, double time)

Input: Principal, rate of interest, and time

Output: Simple interest
 */
public class Simple_Interest_Calculator {

    public static double calculateInterest(double principal, double rate, double time){
        System.out.println("Simple Interest : ");
        return (principal*rate*time)/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        double principle = sc.nextDouble();

        System.out.println("Enter Rate Of Interest (%) : ");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (in Year):");
        double time = sc.nextDouble();

        double SimpleInterest = calculateInterest(principle,rate,time);
        System.out.println(SimpleInterest);

    }
}
