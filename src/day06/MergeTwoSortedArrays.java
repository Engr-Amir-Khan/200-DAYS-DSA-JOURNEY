package day06;

public class MergeTwoSortedArrays {
    static void main(String[] args) {
        int []a = {1,4,5};
        int []b = {2,3,4,5,8,10,13};
        int []c = new int[a.length + b.length];

        swapElements(a,b,c);

        for(int elem : c){
            System.out.print(elem + " ");
        }


    }

    public static void swapElements(int[]a,int[]b,int[]c){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<a.length && j<b.length ){
            if(a[i] <= b[j]){
               c[k] = a[i];
               i++;
               k++;
            }else if(b[j] <= a[i]){
                c[k] = b[j];
                j++;
                k++;
            }

        }

        while (i<a.length || j<b.length) {

            if(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
    }
}
