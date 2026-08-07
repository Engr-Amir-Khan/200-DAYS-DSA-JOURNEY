package day18;

public class SelectionSortingAlgorithm {
    static void main(String[] args) {

        int[]arr = {5,3,1,0,2};


        int n = arr.length-1;
        for (int i = 0; i <=n ; i++) {
            int small = Integer.MAX_VALUE;
            int idx = 0;

            for (int j = i; j <= n; j++) {

                if(small>arr[j]){
                    small = arr[j];
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for(int elem : arr){
            System.out.print(elem + " ");
        }

    }
}
