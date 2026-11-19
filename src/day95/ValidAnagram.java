package day95;

import java.util.HashMap;

public class ValidAnagram {
    static void main(String[] args) {
         boolean result = isValid("anagram", "nagaram");
        System.out.println(result);


    }

    public static boolean isValid(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<String,String> hm = new HashMap<>();

        for(String v : hm.keySet()){
            System.out.print(hm.get(v));
        }
        return true;

    }
}
