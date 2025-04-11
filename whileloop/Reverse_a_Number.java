package whileloop;

import java.util.Scanner;

/*
     Reverse a Number:-
         Write a Java program to reverse a given integer using a while loop
 */
public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int rev = 0;
        while (num!=0){
            int digit = num % 10;  // Extract last digit
            rev = rev * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit



        }
        System.out.println(rev);


    }
}
