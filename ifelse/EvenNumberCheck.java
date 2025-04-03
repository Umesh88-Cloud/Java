package ifelse;

import java.util.Scanner;


public class EvenNumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number to check the number is even or not ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Number is even");
                break;
            } else {
                System.out.println("Number is not even");
            }
        }
    }
}
