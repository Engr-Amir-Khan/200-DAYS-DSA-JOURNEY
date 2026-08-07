package day05;

public class ZerosAndOnes {
    static void main(String[] args) {
        int[] arr  = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int zero = 0, one = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }else {
                one++;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < arr.length ; i++) {
            arr[i] = 1;
        }

        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
