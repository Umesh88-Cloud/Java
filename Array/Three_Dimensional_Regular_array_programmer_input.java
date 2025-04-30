package Array;

public class Three_Dimensional_Regular_array_programmer_input {
    public static void main(String[] args) {

//        2Clg -> 3Dep -> 4Std

        int arr [][][] = {
                {       {34,56,78,90},
                        {32,45,67,86},
                        {12,34,23,31}

                },
                {
                        {11,22,33,44},
                        {12,23,34,45},
                        {56,67,78,89}
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
