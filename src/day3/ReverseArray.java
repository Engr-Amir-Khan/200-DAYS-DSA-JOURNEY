package day3;

public class ReverseArray {
    static void main(String[] args) {
        int[]arr = {4,2,55,2,5,10,3,455,6,66};
        int n = arr.length-1;
        int i = 0, j = arr.length-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
