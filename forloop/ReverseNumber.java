package forloop;

// Reverse a Number: Write a program that reverses a given number using a for loop.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        int rev = 0;

        for (int i=num;i!=0;i/=10){
            int lastdigit = i % 10;
            rev = rev * 10 + lastdigit;
        }
        System.out.println(rev);





    }
}
