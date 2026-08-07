package day26;

import java.util.Arrays;
import java.util.Collection;

public class Anagram {
    static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

       char []an = s1.toCharArray();
        Arrays.sort(an);

       String result = new String(an);
        System.out.println(result);

        char []an2 = s2.toCharArray();
        Arrays.sort(an2);

       String result2 = new String(an2);
        System.out.println(result2);




        if(s1.length() != s2.length()){
            System.out.println("not");
        }
        boolean isAnagram = true;
        for (int i = 0; i < s1.length(); i++) {
            if(result.charAt(i) != result2.charAt(i)){

                isAnagram = false;
            }
        }

        if(!isAnagram){
            System.out.println("not");
        }else{
            System.out.println("anagaram");
        }


    }
}
