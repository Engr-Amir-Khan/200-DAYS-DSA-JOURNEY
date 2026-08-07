package day6;

import java.util.ArrayList;

public class SwapUsingArrayList {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);

        int n = arr.size();
        int i = 0, j=n-1;

        while (i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
