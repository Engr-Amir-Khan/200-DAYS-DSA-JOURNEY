package day6;

public class MergeThreesortedArrays {
    static void main(String[] args) {
        int []a = {1,4,5};
        int []b = {2,3,4,5,8,10,13};
        int []c = {1,5,9,9,10,90};
        int [] ans = new int [a.length + b.length + c.length];

        for(int elem : ans){
            System.out.print(elem + " ");
        }
        System.out.println();

        details(a,b,c, ans);

        for(int elem : ans){
            System.out.print(elem + " ");
        }
    }

    public static void details(int[]a,int[]b, int[]c, int[] k){
        int i = 0, j=0, y=0, z=0;

        while (i<=a.length && j<b.length && y<c.length-1){
            if(a[i] <= b[j] && a[i] <= c[y]){
                k[z] = a[i];
                i++;
                z++;
            }else if(b[j] <= c[y] && b[j] <= a[i]){
                k[z] = b[j];
                j++;
                z++;
            }else{
                k[z] = c[y];
                y++;
                z++;
            }
        }

        while (i<a.length){
            k[z] = a[i];
            z++;
            i++;
        }
        while (j<b.length){
            k[z] = b[j];
            z++;
            j++;
        }
        while (y<c.length){
            k[z] = c[y];
            z++;
            y++;
        }

    }
}
