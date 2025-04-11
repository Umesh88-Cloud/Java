package whileloop;

/*
   Binary to Decimal Conversion:-
        Write a Java program to convert a binary number to decimal using a while loop.
 */

import java.util.Scanner;

public class Binary_to_Decimal_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number ");
        int binary = sc.nextInt();

        double decimal = 0;
        double power = 0;

        int temp = binary;

        while (temp!=0){
            int digit = temp % 10; // for getting last digit
            if (digit !=0 && digit != 1){
                System.out.println("Invalid Binary Number");
                return;
            }
            decimal = decimal + digit * Math.pow(2,power);
            temp/=10;
            power++;
        }
        System.out.println(decimal);

    }
}
