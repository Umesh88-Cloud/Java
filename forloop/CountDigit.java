package forloop;

//  Count Digits: Write a program that counts the number of digits in a given number using a for loop.

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        int count = 0;

        if (num==0){
            count = 1;
        }
        else {
            for (int i = num; i!=0; i/=10) {
                count++;
            }

        }
        System.out.println(count);



/*      Q. java program to add a digits in a number
        EX:
        Number entered by user = 123
        sum of digits = 6

 */

         Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num1 = s.nextInt();

        int sum = 0;

        for (int i=num1;i!=0;i/=10){
            sum = sum + i%10;
        }
        System.out.println(sum);


    }
}
