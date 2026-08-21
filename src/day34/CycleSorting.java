package day34;

public class CycleSorting {
    static void main(String[] args) {
        int[]arr = {3,1,5,4,2};


        int n = arr.length;

        int i =0;
        while (i<n){
            if(arr[i] == i+1){
                i++;
            }else{
                int idx = arr[i] -1;

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(int elem: arr){
            System.out.print( elem +  " ");
        }
    }
}
