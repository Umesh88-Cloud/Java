package ifelse;

import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if (num1<num2){
            System.out.println("Smaller number is: "+ num1);
        }
        if (num2<num1){
            System.out.println("Smaller number is : "+ num2);
        }
        else {
            System.out.println("Both numbers are equals");
        }
    }
}
