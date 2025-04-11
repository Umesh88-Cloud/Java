package whileloop;

/*
    Menu-Driven Calculator:-
         Write a Java program to create a menu-driven calculator that performs addition, subtraction, multiplication,
          and division using a while loop.
 */

import java.util.Scanner;

public class Menu_Driven_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2,result;
        int choice;

        while (true){
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Enter Your Choice");
            choice= sc.nextInt();
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();

              switch (choice){
                  case 1:
                      result = num1+num2;
                      System.out.println("Addition is : "+ result);
                      break;

                  case 2:
                      result = num1-num2;
                      System.out.println("Subtraction is : "+ result);
                      break;

                  case 3:
                      result = num1 * num2;
                      System.out.println("Multiplication is : "+ result);
                      break;

                  case 4:
                      if (num2!=0){
                          result = num1/num2;
                          System.out.println("Division is : "+  result);
                          break;
                      }
                      else {
                          System.out.println("We can not perform division because cannot divide by zero");
                      }
                  case 5:
                      System.out.println("Exit successfully");

                  default:
                      System.out.println("Invalid Choice Please Select Between 1 to 5 ");

              }
        }

    }
}
