package day93;

import java.util.HashMap;

public class Hashmaps {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("amir",10);
        map.put("khang",20);
        map.put("ali",50);
        map.put("lala",100);
        map.put("amir",22);

//        traversing
        System.out.println(map.get("amir"));
        System.out.println(map.containsKey("ali"));
        for(String key: map.keySet()){
            System.out.print(key);
        }
    }
}
