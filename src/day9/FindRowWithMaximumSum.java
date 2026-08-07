package day9;

public class FindRowWithMaximumSum {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,42},{4,82,30},{11,182}};
        int maxRowSum = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+= arr[i][j];
            }
            if(maxRowSum < sum){
                maxRowSum = sum;
                idx = i;
            }
        }
        System.out.println("Maximum sum is  " + maxRowSum);
        System.out.println("Row number is " + idx);
    }
}
