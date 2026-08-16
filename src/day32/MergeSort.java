package day32;

public class MergeSort {
    static void main(String[] args) {
        int[]arr = {5,2,8,4,1,6,7,3,-5};
        mergeSort(arr);
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        if(n==1){
            return;
        }

//        step 1 : create 2 new array of n/2 size

        int [] a = new int[n/2];
        int [] b = new int[n-n/2];

        int idx =0;
//        step2 copy paste all element from starting to ending on these two arrays

        for (int i = 0; i <a.length; i++) {
            a[i] = arr[idx];
            idx++;
        }

        for (int i = 0; i <b.length; i++) {
            b[i] = arr[idx];
            idx++;
        }

//        magic

//        conqure
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);

    }

    private static void merge(int[] a, int[] b, int[] c) {

        int i=0, j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i<a.length){
            c[k] = a[i];

            i++;
            k++;
        }

        while (j<b.length){
            c[k] = b[j];

            j++;
            k++;
        }

    }


}
