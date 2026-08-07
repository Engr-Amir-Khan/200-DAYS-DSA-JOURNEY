package day27;

import java.util.Scanner;

public class OptimizedPowerQuestion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");

        int b = sc.nextInt();
        int result = power(a,b);

        System.out.print("A raised to power b is : " + result);
    }

    public  static int power(int a,int b){
        if(b==0){
            return -1;
        }

        int call = power(a, b/2);
        if(b%2==0){
            return call*call;
        }else{

            return a * call * call;

        }
    }
}
