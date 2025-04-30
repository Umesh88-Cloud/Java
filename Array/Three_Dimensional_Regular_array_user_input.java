package Array;

import java.util.Scanner;

public class Three_Dimensional_Regular_array_user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of College: ");
        int clg = sc.nextInt();

        System.out.println("Enter The Number Of Department In Each College: ");
        int Dept = sc.nextInt();

        System.out.println("Enter The Number Of Student In Each Department : ");
        int Std = sc.nextInt();

        int arr [][][] = new int[clg][Dept][Std];

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.print("Enter The Roll num of Student  "+k+" of college "+i+ " Dept "+j+" ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.print( arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
