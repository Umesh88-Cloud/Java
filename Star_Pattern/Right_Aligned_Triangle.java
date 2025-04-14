package Star_Pattern;
/*

   *
  **
 ***
****


 */

public class Right_Aligned_Triangle {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            // for spaces
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
