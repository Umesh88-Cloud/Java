package whileloop;

/*
Factorial of a Number:-
            Write a Java program to find the factorial of a number using a while loop.
 */

import java.util.Scanner;

public class Factorial_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int num = sc.nextInt();

        int i = 1;
        long factorial = 1;

        if (num<0){
            System.out.println("Factorial is not defined for negative number ");
            return;
        }
        while (i<=num){
            factorial = factorial*i;
            i++;
        }
        System.out.println(factorial);

    }
}
