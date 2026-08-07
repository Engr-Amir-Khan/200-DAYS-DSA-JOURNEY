package day9;

public class FindMinimumElementOutOfAllMaxElement {
    static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 42}, {4, 82, 30}, {11, 18,22}};

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int rowMax = Integer.MIN_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                if (rowMax < arr[i][j]) {
                    rowMax = arr[i][j];
                }
            }

            int answer = Integer.MAX_VALUE;
            answer = Integer.min(answer , rowMax);
            min =  answer;

        }
        System.out.println(min);
    }
}
