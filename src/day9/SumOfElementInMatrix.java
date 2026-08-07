package day9;



public class SumOfElementInMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,8,3},{11,18}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
