package day19;

public class SearchInDescendingOrder {
    static void main(String[] args) {
        int[]arr = {9,8,5,4,2,0,-11,-9};

        int start =0;
        int end = arr.length-1;
        int target = 8;
        int index =0;
        boolean isFound = false;
        while (start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==target){
                index= mid;
                isFound = true;
                break;

            }else if(arr[mid]> target){
                start = mid+1;
            }else if(arr[mid]< target){
                end = mid-1;
            }
        }

        if(isFound){
            System.out.println(index);
        }else{
            System.out.println("Not available in current array ..");
        }


    }
}
