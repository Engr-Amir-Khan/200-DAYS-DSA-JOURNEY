package day17;

import java.util.ArrayList;

public class MoveAllZeroesToEndWithoutChangingOrder {
    static void main(String[] args) {
        int [] arr = {1,0,-2,3,0,4,8,0,10,12};

        int n=arr.length-1;

        ArrayList<Integer> ans = new ArrayList<>();
        int count =0;

        for (int i = 0; i <n; i++) {
                if(arr[i]!=0){
                    ans.add(arr[i]);
                }else{
                    count++;
                }
        }

        for (int i = 0; i <count; i++) {
            ans.add(0);
        }




        System.out.print(ans + " ");
    }
}
