package day09;

public class PrintColumnWise {
    static void main(String[] args) {
        int[][] arr = {{1, 2, 3,90}, {4, 82, 30,900}, {11, 18,22},{121,13,13,12}};

            int m = arr.length;
            int n = arr[0].length;

            for (int j = 0; j <n; j++) {
                for(int  i=0; i<m; i++) {

                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();


            }

        }
}
