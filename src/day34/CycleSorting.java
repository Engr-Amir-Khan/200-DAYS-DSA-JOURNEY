package day34;

public class CycleSorting {
    static void main(String[] args) {
        int[]arr = {3,1,5,4,2};


        int n = arr.length;
        int i=0;
        while (i<n){
            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){

                int swapValue = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = swapValue;


            }else{
                i++;
            }
        }
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
