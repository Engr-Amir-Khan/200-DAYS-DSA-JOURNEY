package day2;

public class ProductOfElementsInArray {
    static void main(String[] args) {
        int[]arr = {-1,4,5,2};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        System.out.println("Product of array element is = " + product);
    }
}
