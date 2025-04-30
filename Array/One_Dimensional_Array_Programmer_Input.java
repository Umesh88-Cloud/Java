package Array;

public class One_Dimensional_Array_Programmer_Input {
    public static void main(String[] args) {


        int arr [] = {12,23,44,56,77,78,90};

        // Display Array Element --> Imperative Style Programming
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();  // It is used for new line



        // Display Array Element By For-Each loop --> Declarative Style Programming
        for (int k:arr){
            System.out.print(k+" ");
        }


    }
}
