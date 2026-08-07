package day2;

public class MultiplyOddElementByTwoAndTenAddToEven {
    static void main(String[] args) {
        int[] arr = {3,4,6,2,5,7};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print((arr[i] + 10) + " ");

            }else{
                System.out.print((arr[i]*2) + " ");

            }
        }
    }
}
