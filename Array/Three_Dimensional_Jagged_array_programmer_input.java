package Array;

public class Three_Dimensional_Jagged_array_programmer_input {
    public static void main(String[] args) {


        //        2Clg -> 3Dep -> student are not fixed in each department

        int arr [][][] = {
                {       {34,56,},
                        {32,45,67,},
                        {12,34,23,31}

                },
                {
                        {11,22,33,44},
                        {12,23,34},
                        {56,67}
                }

        };

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


