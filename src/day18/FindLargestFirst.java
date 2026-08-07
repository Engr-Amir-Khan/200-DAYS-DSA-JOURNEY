package day18;

public class FindLargestFirst {
    static void main(String[] args) {
        int []arr = {2,3,9,-44,0,-1,55,22,4,2,7};

        int n = arr.length;

        for (int i = n-1; i >=0 ; i--) {
            int largest = Integer.MIN_VALUE;
            int index = 0;

            for (int j = i; j>=0; j--) {
                if(largest<arr[j]){
                    largest = arr[j];
                    index = j;
                }
            }

            int t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;

        }

        for(int elem : arr){
            System.out.print( elem  + "  ");
        }
    }
}
