package whileloop;

/*
Generate Fibonacci Series:-
        Write a Java program to print the first N terms of the Fibonacci series using a while loop.

 */

import java.util.Scanner;

public class Generate_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int firstnum = 0;
        int secondnum = 1;
        int i = 1;

        while (i<=num){
            System.out.println(firstnum);
            int nextnum = firstnum+secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
            i++;
        }



    }
}
