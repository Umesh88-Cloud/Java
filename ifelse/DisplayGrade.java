package ifelse;

import java.util.Scanner;

/*
    Problem Statement : Write a Java program that takes marks of a student and prints the grade based on
    the following conditions:

90-100: A

80-89: B

70-79: C

60-69: D

Below 60: Fail
 */
public class DisplayGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks = sc.nextInt();

        if (marks>=90 && marks<=100){
            System.out.println("You Achieved 'A' Grade");
        }
        if (marks>=80 && marks<=89){
            System.out.println("You Achieved 'B' Grade");
        }
        if (marks>=70 && marks<=79){
            System.out.println("You Achieved 'C' Grade");
        }
        if (marks>=60 && marks<=69){
            System.out.println("You Achieved 'D' Grade");
        }
        else {
            System.out.println("You Fail");
        }





    }
}
