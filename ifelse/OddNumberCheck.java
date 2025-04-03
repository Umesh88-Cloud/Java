package ifelse;

import java.util.Scanner;

public class OddNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number % 2 != 0){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
