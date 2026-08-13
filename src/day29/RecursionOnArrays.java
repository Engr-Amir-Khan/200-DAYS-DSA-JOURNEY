package day29;

public class RecursionOnArrays {
    static void main(String[] args) {
        int[] arr = {3,5,8,9,10,11,13,500,3000};
//        printArr(arr, 0);
        int target = 5;
        boolean result = linearSearch(arr, target, 0);
        System.out.println(result);
    }



    //printing array elements using recursion
    public static void printArr(int[] arr, int idx){

        int n = arr.length;
        if(idx == n) return;

        System.out.print(arr[idx] + " ");
        printArr(arr, idx+1);
    }



    //linear search using recursion
    public static boolean linearSearch(int[]arr, int target, int idx){


        if(idx == arr.length){
            return false;
        }

        if(arr[idx]== target){
            return true;

        }


       return linearSearch(arr, target, idx+1);



    }
}
