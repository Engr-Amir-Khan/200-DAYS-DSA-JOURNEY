package day16;

public class BubbleSort {
    static void main(String[] args) {
        int [] arr = {3,1,5,4,2,0};

        for (int i = 0; i < arr.length-1; i++) {
            boolean isSorted = true;
            for (int j = 0; j <arr.length-1-i; j++) {

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }


            }
            if(isSorted){
                break;
            }
        }

        for(int elem: arr){
            System.out.print(elem + "  ");
        }
    }
}
