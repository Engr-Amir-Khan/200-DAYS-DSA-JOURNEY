package day01;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(num > 999 && num < 10000){
            System.out.println("Four digit number");
        }else{
            System.out.println("Not four Digit number");
        }
    }
}
