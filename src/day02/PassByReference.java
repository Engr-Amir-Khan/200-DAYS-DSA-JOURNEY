package day02;

public class PassByReference {
    static void main(String[] args) {
        int[]arr = {2,5,9,90};
        System.out.println(arr[3]);
        change(arr);
        System.out.println(arr[3]);
    }
    public static void change(int[] z){
        z[3] = 55;
    }
}
