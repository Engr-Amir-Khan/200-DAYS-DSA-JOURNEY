package day10;

public class TransposeOfMatrix {
    static void main(String[] args) {
        int [][] arr = {{1,2,3},  {4,5,6},{7,8,9}};
        int n = arr[0].length;
        int m = arr.length;
        for (int j = 0; j <n; j++) {
            for (int i = 0; i < m; i++) {
                arr[j][i] = arr[i][j];
            }
            System.out.println();
        }


        for (int[] elem : arr){
            for(int ans :  elem){
                System.out.print(ans + " ");
            }
            System.out.println();
        }

    }
}
