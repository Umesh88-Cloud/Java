package whileloop;

/*
     Count Digits in a Number:-

         Write a Java program to count the number of digits in a given integer using a while loop.
 */

import java.util.Scanner;

public class Count_Digits_in_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0){
            count = 1;
        }
        else {
            while (num>0){
                num = num/10; // Remove last digit
                count++;
            }
        }
        System.out.println("count: "+ count);

    }
}
