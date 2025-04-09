package forloop;

import java.util.Scanner;

/*    Factorial Calculation: Write a program that calculates and prints the factorial
       of a given number using a for loop.

 */
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i=1;i<=num;i++){
            factorial = factorial * i;

        }
        System.out.println(factorial);




    }
}
