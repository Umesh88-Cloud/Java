package whileloop;

/*
     Sum of Digits:-

          Write a Java program to find the sum of digits of a given number using a while loop.

 */

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        int sum = 0;
        if (num == 0){
            sum = 1;
        }
        else {
            while (num>0){
                sum = sum + num % 10;
                num = num / 10;
            }
        }
        System.out.println(sum);

    }
}
