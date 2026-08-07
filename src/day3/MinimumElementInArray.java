package day3;

public class MinimumElementInArray {
    static void main(String[] args) {
        int[]arr = {3,5,-2,1,9};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min> arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
