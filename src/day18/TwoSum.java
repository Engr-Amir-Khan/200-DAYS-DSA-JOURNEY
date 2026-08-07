package day18;

import java.util.Arrays;

public class TwoSum {
    static void main(String[] args) {
        int [] arr= {2,3,5,-9,6,9};

        Arrays.sort(arr);

        int target = 7;
        int i =0;
        int j = arr.length-1;

        int idx1 =0;
        int idx2=0;

        while(i<=j){
            if(arr[i] + arr[j] == target){
                idx1 = i;
                idx2 = j;
                break;
            }else if(arr[i] + arr[j] > target){
                j--;
            }else{
                i++;
            }
        }


        System.out.print( idx1 + " "  + idx2);
    }
}
