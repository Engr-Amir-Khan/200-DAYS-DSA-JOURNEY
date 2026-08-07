package day11;

import java.util.ArrayList;

public class TwoDArrayList {
    static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr   = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);

        a2.add(200);
        a2.add(400);
        a2.add(500);
        arr.add(a2);
        arr.add(a1);
        a2.remove(a2.size()-1);
        System.out.println(arr);
    }
}
