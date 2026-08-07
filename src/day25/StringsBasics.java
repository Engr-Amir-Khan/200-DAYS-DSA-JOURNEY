package day25;

import java.util.Scanner;

public class StringsBasics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words : ");
        String names = sc.nextLine();

        int count =0;
        for (int i = 0; i < names.length(); i++) {
            String s = names.toLowerCase();
            char vowels = s.charAt(i);
            if(vowels=='a' || vowels=='e' || vowels=='i' ||  vowels=='o'||vowels=='u'){
                count++;
            }
        }
        System.out.print(count);


    }
}
