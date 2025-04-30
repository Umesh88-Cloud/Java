package Array;

import java.util.Scanner;

public class One_Dimensional_Array_User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Loop For Insertion
        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the element at "+i+" position");
            arr[i] = sc.nextInt();
        }

        // loop for display element
        System.out.println("Elements in array:");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
