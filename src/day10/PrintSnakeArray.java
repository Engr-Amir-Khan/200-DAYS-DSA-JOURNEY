package day10;

public class PrintSnakeArray {
    static void main(String[] args) {
        int[][] arr =  {{45, 48, 54}, {21, 89, 87}, {70, 78, 15}};

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }


            }else{
                for (int j = arr[i].length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
    }
}
