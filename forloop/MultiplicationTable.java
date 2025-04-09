package forloop;

import java.util.Scanner;

/*     Multiplication Table: Write a program that takes a number as input and prints its multiplication table up
         to 10 using a for loop.

 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num  = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num * i);
        }

    }
}
