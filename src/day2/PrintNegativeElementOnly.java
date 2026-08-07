package day2;

public class PrintNegativeElementOnly {
    static void main(String[] args) {
        int[]arr = {2,4,44,888,454,4,-23,59,-90};
        boolean isNegative = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
                isNegative = true;
            }
        }
        if(!isNegative){
            System.out.println("No Negative Element IN array");
        }
    }
}
