package day20;

public class PeakIndexInMountainArray {
    static void main(String[] args) {
        int[]arr = {0,10,2,5};
        int start = 1;
        int end = arr.length-2;

        boolean isFound = false;
        int index = -1;

        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                isFound = true;
                index = mid;
                break;
            }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start = mid+1;
            }else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                end = mid-1;
            }
        }

        if(!isFound){
            System.out.println("not preseneted");
        }else{
            System.out.println(index);
        }

    }
}
