package forloop;

// Armstrong Number Check: Write a program that checks whether a given number is an Armstrong number using a for loop.

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int originalnum = num;
        int sum = 0;
        int count = 0;

        for (int i = num;i!=0;i/=10){
            count++;
        }
        for (int i= num;i!=0;i/=10){
            int  lastdigit = i % 10;
            sum = (int) (sum + Math.pow(lastdigit,count));

        }
        if (originalnum == sum ){
            System.out.println("The Given Number Is Armstrong Number");
        }
        else {
            System.out.println("The Given Number Is Not Armstrong Number");
        }

    }
}
