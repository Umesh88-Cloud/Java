package Method;

import java.util.Scanner;

/*
Objective:
Check whether a given number is prime using a Java method.

Requirements:

Method: isPrime(int num)

Input: Integer from the user.

Output: Print whether the number is prime or not.

 */
public class Prime_Number_Checker {
    public static void isPrime(int n){
        boolean isboolesn = true;

        if (n<2){
            System.out.println("It is not prime number");
        }
        else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n % i == 0){
                    isboolesn = false;
                    break;
                }
            }
        }
        if (isboolesn){
            System.out.println("It is prime number");
        }
        else {
            System.out.println("It is not prime number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        isPrime(num);

    }
}
