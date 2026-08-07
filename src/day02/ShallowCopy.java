package day02;

public class ShallowCopy {
    static void main(String[] args) {
        int[] arr = {2,5,2,5,12};
        int[] z = arr;
        z[1] = 900;
        System.out.println(arr[1]);
    }
}
