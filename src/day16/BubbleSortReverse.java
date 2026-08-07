package day16;

public class BubbleSortReverse {
    static void main(String[] args) {
        int[] arr = {5,3,4,1,3,9,44,-23};



        for (int i = 0; i < arr.length-1; i++) {
            boolean isSortedInDecreasingOrder = true;


            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSortedInDecreasingOrder = false;
                }
            }

            if(isSortedInDecreasingOrder){
                break;
            }
        }



        for(int elem : arr){
            System.out.print(elem + " ");
        }



    }
}
