package ifelse;

import java.util.Scanner;

public class Integer_Multiple_Of_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number % 5 == 0){
            System.out.println("It is a multiple of five ");
        }
        else {
            System.out.println("It is not a multiple of five ");
        }
    }
}
