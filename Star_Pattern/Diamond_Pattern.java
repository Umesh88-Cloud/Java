package Star_Pattern;
/*

  *
 ***
*****
 ***
  *

 */

public class Diamond_Pattern {
    public static void main(String[] args) {

        for (int i=1;i<=3;i++){
            // for spaces
            for (int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=3-1;i>=1;i--){
            // for spaces
            for (int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
