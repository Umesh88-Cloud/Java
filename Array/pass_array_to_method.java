package Array;

public class pass_array_to_method {
    public static int [] array(int []arr){
        for (int k:arr){
           System.out.print(k+" ");
       }
        return arr;
    }
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,56,78};


        // calling to a method
        int res[] = array(arr);
        System.out.println(res);

    }
}


