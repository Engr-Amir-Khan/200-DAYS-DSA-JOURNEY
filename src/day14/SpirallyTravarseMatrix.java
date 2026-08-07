package day14;

public class SpirallyTravarseMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};

        int firstRow = 0;
        int lastRow = arr.length-1;
        int firstCol = 0;
        int lastCol = arr[0].length-1;


        while(firstRow<= lastRow && firstCol <= lastCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                System.out.print(arr[firstRow][i] + " ");
            }
            firstRow++;

            for (int j = firstRow; j <= lastRow; j++) {
                System.out.print(arr[j][lastCol] + " ");
            }

            lastCol--;

            {


                if (firstRow <= lastRow) {
                    for (int i = lastCol; i >= firstCol; i--) {
                        System.out.print(arr[lastRow][i] + " ");
                    }

                    lastRow--;
                }

                if (firstCol <= lastCol) {
                    for (int j = lastRow; j >= firstRow; j--) {
                        System.out.print(arr[j][firstCol] + " ");
                    }
                    firstCol++;
                }

            }
        }

    }
}
