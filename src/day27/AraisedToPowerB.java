package day27;

import java.util.Scanner;

public class AraisedToPowerB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");

        int b = sc.nextInt();
        int result = power(a,b);

        System.out.print("A raised to power b is : " + result);

    }

    public static  int power(int a, int b){

        if(b==0){
            return 1;
        }
        int ans = a * power(a,b-1);
        return ans;

    }
}
