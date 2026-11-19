package day95;

import java.util.HashMap;

public class StringEx {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(s.length()!=t.length()){
            System.out.println("not valid anagram");
        }


        HashMap<Integer, String> hm = new HashMap<>();
        int count =0;
        for(int v: hm.keySet()){
           hm.put(count,hm.get(v));
           count++;

        }

        System.out.println(hm);

    }
}
