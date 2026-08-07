package day2;

public class SumOfArrayElements {
    static void main(String[] args) {
        int[]arr = {3,5,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("Sum of array element is = " + sum);
    }

}
