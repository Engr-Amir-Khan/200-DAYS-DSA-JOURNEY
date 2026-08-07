package day1;

public class LargestNumberInArray {
    static void main(String[] args) {
        int[]arr = {23,5,2,-111,55,-3,9};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest element in array is " + largest);
    }
}
