package day01;

public class SecondMaximumNumberInArray {
    static void main(String[] args) {
        int[]arr = {23,4,2,4,55,5,22,21,-53,66,44};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(secondMax < arr[i] && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
