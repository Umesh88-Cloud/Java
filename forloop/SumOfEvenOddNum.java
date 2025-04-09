package forloop;
/*  Sum of Even and Odd Numbers: Write a program to calculate and print the sum of all even
  and odd numbers between 1 and 100 separately using a for loop.

 */
public class SumOfEvenOddNum {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        for (int i= 1;i<=100;i++){
            if (i%2==0){
                even = even + i;
            }
            else {
                odd = odd + i;
            }

        }
        System.out.println(even);
        System.out.println(even);

    }
}
