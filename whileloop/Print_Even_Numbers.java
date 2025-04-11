package whileloop;

/*
    Print Even Numbers :-

         Write a Java program to print all even numbers from 1 to N using a while loop.
 */

import java.util.Scanner;

public class Print_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int i = 2;
        while (i<=num){
            if (i % 2 == 0){
                System.out.println(i);
                i = i+2;   // Increment by 2 to get the next even number
            }
        }
    }
}
