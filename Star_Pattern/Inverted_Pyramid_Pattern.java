package Star_Pattern;
/*

 *******
  *****
   ***
    *

 */

public class Inverted_Pyramid_Pattern {
    public static void main(String[] args) {

        for (int i=4;i>=1;i--){
            // for spaces
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
