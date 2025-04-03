package ifelse;

import java.util.Scanner;

public class Positive_Negative_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number>0){
            System.out.println("Positive number");
        }
        if (number<0){
            System.out.println("Negative number");
        }
        else {
            System.out.println("equal to zero");
        }
    }
}
