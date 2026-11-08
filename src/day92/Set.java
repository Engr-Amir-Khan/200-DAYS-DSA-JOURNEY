package day92;

import java.util.HashSet;

public class Set {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

//        time complexity is o(1) on insert and search and delete

        set.add(20); set.add(20); set.add(30); set.add(50);
        set.add(60); set.add(70); set.add(80);

        for(int i=0; i<set.size(); i++){
            System.out.print(set.contains(i) + " ");
        }
    }
}
