package day13;

public class SetMatrixZero {
    static void main(String[] args) {

        int[][]arr = {{1,0,1},{1,2,5}};
        int m = arr.length;
        int n = arr[0].length;
        int[] row = new int [m];
        int[] column = new int [n];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i][j] == 0){
                    column[j] = -1;
                    row[i] = -1;
                }
            }
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(row[i]<0 || column[j]<0 ){
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }


    }
}
