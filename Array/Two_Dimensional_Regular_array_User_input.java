package Array;

import java.util.Scanner;

public class Two_Dimensional_Regular_array_User_input {
    public static void main(String[] args) {

        // 3Dept ->4Std - each department contain 4 student

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Department: ");
        int Dept = sc.nextInt();

        System.out.println("Enter Number Of Student In Each Department: ");
        int Std = sc.nextInt();

        int arr [][] = new int[Dept][Std];

        // Inserting Array Element
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter the Roll Of Student at "+i+" of "+ j+" Position");
                arr[i][j] = sc.nextInt();

            }

        }
        // Display Array Element

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
