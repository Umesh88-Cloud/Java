package forloop;

/*   Sum of First N Numbers: Write a program that calculates and prints the sum of the first 10 natural numbers
   using a for loop.

 */

import java.util.Scanner;

public class SumOfFirst_N_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        int firstnum = 0;
        for (int i=1;i<=num;i++){
            firstnum = firstnum + i;
        }
        System.out.println(firstnum);
    }
}
