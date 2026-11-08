package day92;

import java.util.TreeSet;

public class TreeSets {
    static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();

//        time complexity is o(logn) on insert, delete, search. It use binary search tree internally

        tset.add(20);
        tset.add(39);
        tset.add(90);
        tset.add(100);
        tset.add(20);
        System.out.println(tset);
    }
}
