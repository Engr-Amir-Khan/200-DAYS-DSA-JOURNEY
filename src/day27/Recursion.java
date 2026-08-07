package day27;

import java.util.Scanner;

public class Recursion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        printingNames(n);
    }

    public static void printingNames(int n){
        if(n==0){
            return;
        }
        printingNames(n-1);
        System.out.println(n);

    }
}
