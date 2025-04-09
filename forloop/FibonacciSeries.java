package forloop;

//   Fibonacci Series: Write a program to print the first N terms of the Fibonacci sequence using a for loop.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i=1;i<=num;i++){
            System.out.print(first+",");
            int next = first+ second;
            first = second;
            second = next;

        }


    }
}
