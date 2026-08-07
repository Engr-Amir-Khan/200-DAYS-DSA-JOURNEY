package day1;

import java.util.Scanner;

public class ArrayBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int[]arr = new int[sc.nextInt()];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int res : arr){
            System.out.print(res +  " ");
        }

    }
}
