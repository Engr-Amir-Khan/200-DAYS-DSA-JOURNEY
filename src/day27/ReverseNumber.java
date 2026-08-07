package day27;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        reverseNumber(n);
    }

    public static void reverseNumber(int n){


        if(n==0){
            return;
        }

        int ans = n%10;
        System.out.print(ans + " ");


        reverseNumber(n/10);
    }
}
