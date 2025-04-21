package Method;
/*
   GCD & LCM Finder
Objective:
Write Java methods to find the GCD and LCM of two numbers.

Requirements:

Method: int gcd(int a, int b), int lcm(int a, int b)

Input: Two integers

Output: GCD and LCM of the numbers
 */

import java.util.Scanner;

public class GCD_LCM_Finder {
    public static int gcd(int a,int b){
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    // Method to find LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a,int b){

        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number 1 : ");
        int a = sc.nextInt();

        System.out.println("Enter The Number 2 :");
        int b = sc.nextInt();

        int gcd = gcd(a,b);
        int lcm = lcm(a,b);

        System.out.println("GCD of "+a+" and "+b+" is "+gcd);
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);



    }
}
