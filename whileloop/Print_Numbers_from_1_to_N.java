package whileloop;

/* Print Numbers from 1 to N :-

     Write a Java program to print numbers from 1 to N using a while loop.

 */


import java.util.Scanner;

public class Print_Numbers_from_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int i = 1;
        while (i<=num){
            System.out.println(i);
            i++;
        }

    }
}
