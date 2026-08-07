package day2;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,3,-2,-55,90,1000,55,89};
        for (int elem : arr){
            System.out.print(elem +  " ");
        }
        System.out.println();
        System.out.println("Enter element what do u want to search ? = ");
        int n = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                System.out.print("Yes Element available at " + i + " index position ");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.print("Sorry element did not find in the given array ");
        }

    }
}
