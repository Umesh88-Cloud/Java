package Star_Pattern;
/*
 *********
  *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
 *********

 */

public class Hourglass_Pattern {
    public static void main(String[] args) {

        int n=5; // no of rows
        for (int i=n;i>=2;i--){
            // for spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1||i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            // for spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1||i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
