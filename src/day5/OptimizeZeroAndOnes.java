package day5;

public class OptimizeZeroAndOnes {
    static void main(String[] args) {
        int[] arr  = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int i = 0;
        int j = arr.length-1;

        while (i<j){
            if(arr[i] == 0 && arr[j] ==1){
                i++;
                j--;
            }else if (arr[i] == 1 && arr[j] == 0){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }else if(arr[i] == 0 && arr[j] == 0){
                i++;
            }else {
                j--;
            }
        }
        for (int  elem : arr){
            System.out.print(elem + " ");
        }
    }


}
