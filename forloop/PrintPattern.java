package forloop;

/*   Print a Pattern: Write a program that prints the following pattern using a nested for loop:


*
* *
* * *
* * * *
* * * * *

 */

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Star");
        char ch = sc.next().charAt(0);

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
