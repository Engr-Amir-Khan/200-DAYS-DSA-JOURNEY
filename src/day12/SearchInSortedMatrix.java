package day12;

public class SearchInSortedMatrix {
     static void main(String[] args) {

         int [][] arr = {{1,2,3},  {4,5,6},{7,8,9}};

         int target = 5;
         int m = arr.length;
         int n = arr[0].length-1;

         int i =0;
         int j = n;

         boolean flage = false;

         int row = 0;
         int column = 0;
         while (i<m && j>=0){
             if(target == arr[i][j]) {
                 column =  j;
                 row = i;
                 flage = true;
                 break;
             }
             else if(arr[i][j] < target){
                 i++;
             }else if(arr[i][j] > target){
                 j--;
             }

         }

         if(!flage){
             System.out.println("Element does not exist");
         }else{
             System.out.println(row);
             System.out.println(column);
         }

     }
}
