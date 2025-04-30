package Array;

/*
Ema Harper, a teacher , uses an array to track student attendance in a class. The array contains a series of 1s and 0s,
where:

1 represent that the student was present.
0 represent that the student was absent
The variable k represents the minimum percentage of classes the student must attend to be eligible for an upcoming
examination.

Write a program to determine if the student is eligible for the exam based on the attendance record.

Input:
A string attendance consisting of 1s and 0s , representing the attendance record.
An integer k representing the minimum percentage of classes the student must attend.

Output:
Output "YES" followed by the actual attendance percentage if the student is eligible for the exam.
Output "NO"  followed by the actual attendance percentage if the student is not eligible for the exam.

Example 1 :
Input: attendance =[1,0,1,0,1,0,1], k=70
Output: NO 57

Example 2 :
Input: attendance = [1,1,1,0,1,0,1], k=60
Output : YES 71

int arr[]= {1,1,1,0,1,1,1,1,1,0};
int k=70;
// OUTPUT : YES 80



 */
public class Question_1 {
    public static void main(String[] args) {

        int arr[]= {1,1,1,0,1,1,1,1,1,0};
        int k=70;

        int PresentCount = 0;

        for (int i=0;i< arr.length;i++){
            if (arr[i]==1){
                PresentCount++;
            }
        }
        int percentage = (PresentCount*100)/ arr.length;
        if (percentage>=70){
            System.out.println("Yes "+ percentage);
        }
        else {
            System.out.println("NO " + percentage);
        }


    }
}
