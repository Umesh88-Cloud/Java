package whileloop;
/*
    Sum of First N Natural Numbers :-

         Write a Java program to find the sum of the first N natural numbers using a while loop.


 */

import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i<=num){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


    }
}
