package Method;

import java.util.Scanner;

/*
Fibonacci Series Generator
Objective:
Generate the first N Fibonacci numbers using a method.

Requirements:

Method: void printFibonacci(int count)

Input: Number of terms (N)

Output: Print Fibonacci series up to N terms
 */
public class Fibonacci_Series_Generator {
    public static void printFibonacci(int num){
        int firstnum = 0;
        int secondnum = 1;
        for (int i=1;i<=num;i++){
            System.out.print(firstnum+" ");
            int nextnum = firstnum+secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        printFibonacci(num);

    }
}
