package day02;

import java.util.Arrays;

public class DeepCopy {
    static void main(String[] args) {
        int[]arr = {23,5,66,7};
//        int [] z = arr;

        int [] z = Arrays.copyOf(arr,arr.length);

        z[1] = 43;
        System.out.println(arr[1]);
        System.out.println(z[1]);
    }
}
