package Array;

import java.util.Scanner;

public class Two_Dimensional_Jagged_array_User_input {
    public static void main(String[] args) {

//        3Dept -> in each department number of student is not fixed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of department: ");
        int Dept = sc.nextInt();

        int arr [][] = new int[Dept][];

        // Inserting number of student in each department
        for (int i=0;i<Dept;i++){
            System.out.println("Enter the number of student in Dep "+i);
            int Std = sc.nextInt();
            arr[i] = new int[Std];
        }

        // inserting roll no of student
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter the roll number of student at position "+ i+ " and "+j);
                arr[i][j] = sc.nextInt();
            }
        }

        // Display array

        for (int i=0;i< arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
            System.out.println();
        }

    }
}
