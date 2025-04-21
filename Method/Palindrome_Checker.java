package Method;

/*
    Objective:
Write a Java program that checks whether a given string is a palindrome using a method.

Requirements:

Create a method isPalindrome(String str) that returns true if the input is a palindrome, otherwise false.

Input: A string from the user.

Output: Whether the string is a palindrome.
 */

import java.util.Scanner;

public class Palindrome_Checker {

    public static boolean isPalindrome(String str){
        String original = str;
        int length = str.length();
        String rev = "";
        for (int i=length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if (original.equals(rev)){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));


    }
}
