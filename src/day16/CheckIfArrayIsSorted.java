package day16;

public class CheckIfArrayIsSorted {
    static void main(String[] args) {
        int []arr = {1,1, 2,4,7};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    break;
                }
        }

        if(isSorted){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
