package day29;

public class ReverseArrayUsingRecursion {
    static void main(String[] args) {
        int[] arr = {3,5,8,9,10,11,13,500,3000};
        int n = arr.length-1;
        int i=0;
        reverse(arr,i,n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void  reverse(int[]arr,int i, int j){


        if(i>j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


        reverse(arr,i+1, j-1);

    }
}
