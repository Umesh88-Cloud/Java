package forloop;

//   Even Numbers: Write a for loop that prints all even numbers between 1 and 50.

public class EvenNumber {
    public static void main(String[] args) {
        for (int i =1;i<=50;i++){
            if (i % 2 == 0){
                System.out.println("Even Number:"+ i);
            }
        }
    }
}
