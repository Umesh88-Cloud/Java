package Star_Pattern;
/*

 *       *
 **     **
 ***   ***
 **** ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *


 */

public class Butterfly_Pattern {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(5-i);
            for (int j=1;j<spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i=5-1;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(5-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
