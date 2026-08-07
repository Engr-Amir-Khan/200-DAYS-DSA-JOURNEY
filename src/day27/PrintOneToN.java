package day27;

import java.util.Scanner;

public class PrintOneToN {
    static  int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
         n = sc.nextInt();
        printing(1);


    }

    public static void printing(int x ){
        if(x>n){
            return;
        }
        System.out.println(x);

        printing(x+1);
    }
}
