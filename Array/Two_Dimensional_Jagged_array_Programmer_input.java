package Array;

public class Two_Dimensional_Jagged_array_Programmer_input {
    public static void main(String[] args) {
        // 3Dept --> not fixed number of student in each department

        int arr[][] = {
                {10,20,30},
                {40,50,60,70,80},
                {90,100,112,113,114,115,116}
        };

        // Display Array Element
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Display Array Element Using for-each loop
        for (int k[]:arr){
            for (int m:k){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
