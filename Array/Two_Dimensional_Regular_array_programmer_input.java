package Array;

public class Two_Dimensional_Regular_array_programmer_input {
    public static void main(String[] args) {

        // 3Dept -> 4Std - each department contain 4 student

        int arr [][] = {
                {1,2,3,4}, // Department 0
                {5,6,7,8},  // Department 1
                {9,10,11,12} // Department 2
        };
        System.out.println(arr.length); // we get 3
        System.out.println(arr[0].length); // we get 4
        System.out.println(arr[1][2]);  // we get 7

        // Display Array Element

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // new line
        }



    }
}
