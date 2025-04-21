package Method;

import java.util.Scanner;

/*
   Problem Statement: Student Grade Calculator

Objective:
Create a Java program that uses methods to calculate the average score of a student from multiple
subjects and determine the corresponding grade.

Requirements:

The program should:

Take the name of the student and marks for 5 subjects as input.

Use a method to calculate the average of the marks.

Use another method to determine the grade based on the average:

90-100: Grade A

80-89: Grade B

70-79: Grade C

60-69: Grade D

Below 60: Grade F

Use a method to display the student’s name, average marks, and grade.

You must:

Use at least 3 separate methods (e.g., calculateAverage(), getGrade(), displayResult()).

Keep your code clean, modular, and well-commented.

Bonus:

Validate the input to ensure that all marks are between 0 and 100.

Allow the user to enter marks for multiple students using a loop.
 */

public class Student_Grade_Calculator {
    public static int averagemarks(int[] marks) {
        int sum =0;
        for (int mark:marks){
            sum+=mark;

        }
        return  sum/marks.length;

    }
    public static char studentgrade(int average){
        if (average>=90 && average<=100){
            return 'A';
        }
        else if(average>=80){
            return 'B';
        }
         else if (average>=70){
            return 'C';
        }
        else if (average>=60){
            return 'D';
        }
        else {
            return 'F';
        }


    }


    public static void main(String[] args) {
        boolean b = true;
        while (b) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student name");
            String name = sc.nextLine();

            int[] marks = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter Student " + (i + 1));
                marks[i] = sc.nextInt();
            }

            int average = averagemarks(marks);

            char grade = studentgrade(average);

            System.out.println("Student Name:" + name);
            System.out.println("Average Marks:" + average);
            System.out.println("Student Grade:" + grade);

        }



    }
}
