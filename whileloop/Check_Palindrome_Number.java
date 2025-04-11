package whileloop;

/*
    Check Palindrome Number:-
         Write a Java program to check whether a given number is a palindrome using a while loop.
 */

import java.util.Scanner;

public class Check_Palindrome_Number {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        int temp = Math.abs(num); // Work with positive value

        // Reverse the number using a while loop
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        // Check for palindrome (for negative numbers, optional handling)
        if (Math.abs(original) == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is NOT a palindrome number.");
        }

    }
}
