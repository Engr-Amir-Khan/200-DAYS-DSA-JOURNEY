package day94;

import java.util.LinkedHashMap;

public class LinkedHM {
    static void main(String[] args) {
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();

        lh.put("amir",22);
        lh.put("khan",10);
        lh.put("lala",30);
        lh.put("Ali",33);

        System.out.println(lh);
    }
}
