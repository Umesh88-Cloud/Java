package forloop;

//    Prime Number Check: Write a program that checks whether a given number is prime using a for loop.

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is is prime or not");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num<2){
            System.out.println("It is not a prime number");
        }
        else {
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println("It is Prime Number");
        }
        else {
            System.out.println("It is not Prime NUmber");
        }



//          Print Prime Number Up To n

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The number");
        int num1 = s.nextInt();

        boolean isprime1 = true;

        for (int i=2;i<=num1;i++){
            for (int j=2;j<=i/2;j++){
                if (i % j == 0){
                    isPrime = false;
                }
            }
            if (isprime1){
                System.out.println(i + "is a prime number");
            }
        }







    }
}
