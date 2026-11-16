package day94;

import java.util.TreeMap;

public class TM {
    static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

//        it sorted alphabetically order and time complexity is O(logn)

        tm.put("pakistan",100);
        tm.put("armenia",200);
        tm.put("us",90);

        System.out.println(tm);
    }
}
