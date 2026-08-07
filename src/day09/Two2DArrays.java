package day09;

import java.util.Scanner;

public class Two2DArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.println(arr.length);
        System.out.println("Enter values : ");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] elme : arr){
            System.out.println();
            for (int ans : elme){
                System.out.print(ans +  " ");
            }
        }
    }
}
