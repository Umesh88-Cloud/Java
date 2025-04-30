package Array;

import java.util.Scanner;

public class Three_Dimensional_Jagged_array_user_input {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of College : ");
        int clg = sc.nextInt();

        int arr [][][] = new int[clg][][];

        for (int i=0;i<arr.length;i++){
            System.out.print("Enter The Number Of Department In College "+i+" ");
            int Dept = sc.nextInt();
            arr[i] = new int[Dept][];
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("Enter The Number Of Student In College "+ i+" ,Dep "+ j+" ");
                int Std = sc.nextInt();
                arr[i][j] = new int[Std];
            }
        }

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
