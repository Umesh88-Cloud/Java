package whileloop;
/*
    Check Prime Number:-

         Write a Java program to check whether a given number is prime or not using a while loop.
 */
import java.util.Scanner;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        boolean isboolean = true;

        if (num<=1){
            isboolean = false;
        }
        else {
            int i = 2;
            while (i<=Math.sqrt(num)){
                if (num % i == 0){
                    isboolean = false;
                    break;
                }
                i++;
            }
        }
        if (isboolean){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not prime number");
        }
    }
}
