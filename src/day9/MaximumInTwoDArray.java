package day9;

public class MaximumInTwoDArray {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,82,3},{11,18}};
        int min = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                    if(min<arr[i][j]){
                        min = arr[i][j];
                    }
            }
        }
        System.out.println(min);
    }
}
